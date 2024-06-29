import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class690 {

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "[I")
    private int[] field9733 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "[I")
    private int[] field9741 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Lsf;")
    private class397 field9735;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "Z")
    public boolean field9738;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public int field9729;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public int field9720;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public int field9722;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "Lll;")
    private class488 field9737;

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "[[[B")
    public byte[][][] field9728;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "[[[B")
    private byte[][][] field9723;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "[[[B")
    private byte[][][] field9746;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "[[[B")
    private byte[][][] field9721;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "[[[I")
    public int[][][] field9731;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "[[[B")
    private byte[][][] field9734;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field9727;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field9730;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field9739;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field9745;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "[J")
    public static long[] field9736;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "[[[B")
    public byte[][][] field9743;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[[BIIILpt;I[[B[[BLjo;[ZIILr;)V")
    private final void method3854(int arg0, byte[][] arg1, int arg2, int arg3, int arg4, class520 arg5, int arg6, byte[][] arg7, byte[][] arg8, class335 arg9, boolean[] arg10, int arg11, int arg12, class98 arg13) {
        field9730++;
        boolean[] var15 = arg9 != null && arg9.field4880 ? class392.field5936[arg12] : class334.field4849[arg12];
        if (arg3 > 0) {
            if (arg6 > 0) {
                int var16 = arg1[arg6 - 1][arg3 - 1] & 0xFF;
                if (var16 > 0) {
                    class335 var17 = this.field9735.method2472(4, var16 - 1);
                    if (var17.field4876 != -1 && var17.field4880) {
                        byte var18 = arg8[arg6 - 1][arg3 - 1];
                        int var19 = arg7[arg6 - 1][arg3 - 1] * 2 + 4 & 0x7;
                        int var20 = class284.method1682(arg13, 26685, var17);
                        if (class275.field3592[var18][var19]) {
                            class112.field1711[0] = var17.field4876;
                            class476.field6816[0] = var20;
                            class14.field325[0] = var17.field4881;
                            class332.field4827[0] = var17.field4870;
                            class512.field7210[0] = var17.field4874;
                            class572.field8304[0] = 256;
                        }
                    }
                }
            }
            if (arg2 - 1 > arg6) {
                int var21 = arg1[arg6 + 1][arg3 - 1] & 0xFF;
                if (var21 > 0) {
                    class335 var22 = this.field9735.method2472(4, var21 - 1);
                    if (var22.field4876 != -1 && var22.field4880) {
                        byte var23 = arg8[arg6 + 1][arg3 - 1];
                        int var24 = arg7[arg6 + 1][arg3 - 1] * 2 + 6 & 0x7;
                        int var25 = class284.method1682(arg13, 26685, var22);
                        if (class275.field3592[var23][var24]) {
                            class112.field1711[2] = var22.field4876;
                            class476.field6816[2] = var25;
                            class14.field325[2] = var22.field4881;
                            class332.field4827[2] = var22.field4870;
                            class512.field7210[2] = var22.field4874;
                            class572.field8304[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg11 - 1 > arg3) {
            if (arg6 > 0) {
                int var26 = arg1[arg6 - 1][arg3 + 1] & 0xFF;
                if (var26 > 0) {
                    class335 var27 = this.field9735.method2472(4, var26 - 1);
                    if (var27.field4876 != -1 && var27.field4880) {
                        byte var28 = arg8[arg6 - 1][arg3 + 1];
                        int var29 = (arg7[arg6 - 1][arg3 + 1] * 2) + 2 & 0x7;
                        int var30 = class284.method1682(arg13, 26685, var27);
                        if (class275.field3592[var28][var29]) {
                            class112.field1711[6] = var27.field4876;
                            class476.field6816[6] = var30;
                            class14.field325[6] = var27.field4881;
                            class332.field4827[6] = var27.field4870;
                            class512.field7210[6] = var27.field4874;
                            class572.field8304[6] = 64;
                        }
                    }
                }
            }
            if (arg6 < arg2 - 1) {
                int var31 = arg1[arg6 + 1][arg3 + 1] & 0xFF;
                if (var31 > 0) {
                    class335 var32 = this.field9735.method2472(4, var31 - 1);
                    if (var32.field4876 != -1 && var32.field4880) {
                        byte var33 = arg8[arg6 + 1][arg3 + 1];
                        int var34 = arg7[arg6 + 1][arg3 + 1] * 2 & 0x7;
                        int var35 = class284.method1682(arg13, 26685, var32);
                        if (class275.field3592[var33][var34]) {
                            class112.field1711[4] = var32.field4876;
                            class476.field6816[4] = var35;
                            class14.field325[4] = var32.field4881;
                            class332.field4827[4] = var32.field4870;
                            class512.field7210[4] = var32.field4874;
                            class572.field8304[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg3 > 0) {
            int var36 = arg1[arg6][arg3 - 1] & 0xFF;
            if (var36 > 0) {
                class335 var37 = this.field9735.method2472(4, var36 - 1);
                if (var37.field4876 != -1) {
                    byte var38 = arg8[arg6][arg3 - 1];
                    byte var39 = arg7[arg6][arg3 - 1];
                    if (var37.field4880) {
                        int var40 = 2;
                        int var41 = (var39 * 2) + 4;
                        int var42 = class284.method1682(arg13, 26685, var37);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class275.field3592[var38][var41] && class512.field7210[var40] <= var37.field4874) {
                                class112.field1711[var40] = var37.field4876;
                                class476.field6816[var40] = var42;
                                class14.field325[var40] = var37.field4881;
                                class332.field4827[var40] = var37.field4870;
                                if (class512.field7210[var40] == var37.field4874) {
                                    class572.field8304[var40] = class151.method1076(class572.field8304[var40], 32);
                                } else {
                                    class572.field8304[var40] = 32;
                                }
                                class512.field7210[var40] = var37.field4874;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg4 & 0x3]) {
                            arg10[0] = class392.field5936[var38][class425.method2563(var39 + 2, 3)];
                        }
                    } else if (!var15[arg4 & 0x3]) {
                        arg10[0] = class334.field4849[var38][class425.method2563(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg0 > -18) {
            this.method3858(null, null, null, null, null, 88, (byte) -93);
        }
        if ((arg11 - 1) > arg3) {
            int var44 = arg1[arg6][arg3 + 1] & 0xFF;
            if (var44 > 0) {
                class335 var45 = this.field9735.method2472(4, var44 - 1);
                if (var45.field4876 != -1) {
                    byte var46 = arg8[arg6][arg3 + 1];
                    byte var47 = arg7[arg6][arg3 + 1];
                    if (var45.field4880) {
                        int var48 = 4;
                        int var49 = (var47 * 2) + 2;
                        int var50 = class284.method1682(arg13, 26685, var45);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class275.field3592[var46][var49] && var45.field4874 >= class512.field7210[var48]) {
                                class112.field1711[var48] = var45.field4876;
                                class476.field6816[var48] = var50;
                                class14.field325[var48] = var45.field4881;
                                class332.field4827[var48] = var45.field4870;
                                if (class512.field7210[var48] == var45.field4874) {
                                    class572.field8304[var48] = class151.method1076(class572.field8304[var48], 16);
                                } else {
                                    class572.field8304[var48] = 16;
                                }
                                class512.field7210[var48] = var45.field4874;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg4 + 2 & 0x3]) {
                            arg10[2] = class392.field5936[var46][class425.method2563(-(-var47), 3)];
                        }
                    } else if (!var15[arg4 + 2 & 0x3]) {
                        arg10[2] = class334.field4849[var46][class425.method2563(var47, 3)];
                    }
                }
            }
        }
        if (arg6 > 0) {
            int var52 = arg1[arg6 - 1][arg3] & 0xFF;
            if (var52 > 0) {
                class335 var53 = this.field9735.method2472(4, var52 - 1);
                if (var53.field4876 != -1) {
                    byte var54 = arg8[arg6 - 1][arg3];
                    byte var55 = arg7[arg6 - 1][arg3];
                    if (var53.field4880) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class284.method1682(arg13, 26685, var53);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class275.field3592[var54][var57] && class512.field7210[var56] <= var53.field4874) {
                                class112.field1711[var56] = var53.field4876;
                                class476.field6816[var56] = var58;
                                class14.field325[var56] = var53.field4881;
                                class332.field4827[var56] = var53.field4870;
                                if (class512.field7210[var56] == var53.field4874) {
                                    class572.field8304[var56] = class151.method1076(class572.field8304[var56], 8);
                                } else {
                                    class572.field8304[var56] = 8;
                                }
                                class512.field7210[var56] = var53.field4874;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg4 + 3 & 0x3]) {
                            arg10[3] = class392.field5936[var54][class425.method2563(var55 + 1, 3)];
                        }
                    } else if (!var15[arg4 + 3 & 0x3]) {
                        arg10[3] = class334.field4849[var54][class425.method2563(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg6 < (arg2 - 1)) {
            int var60 = arg1[arg6 + 1][arg3] & 0xFF;
            if (var60 > 0) {
                class335 var61 = this.field9735.method2472(4, var60 - 1);
                if (var61.field4876 != -1) {
                    byte var62 = arg8[arg6 + 1][arg3];
                    byte var63 = arg7[arg6 + 1][arg3];
                    if (var61.field4880) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class284.method1682(arg13, 26685, var61);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class275.field3592[var62][var65] && class512.field7210[var64] <= var61.field4874) {
                                class112.field1711[var64] = var61.field4876;
                                class476.field6816[var64] = var66;
                                class14.field325[var64] = var61.field4881;
                                class332.field4827[var64] = var61.field4870;
                                if (class512.field7210[var64] == var61.field4874) {
                                    class572.field8304[var64] = class151.method1076(class572.field8304[var64], 4);
                                } else {
                                    class572.field8304[var64] = 4;
                                }
                                class512.field7210[var64] = var61.field4874;
                            }
                            var64--;
                            var65++;
                        }
                        if (!var15[arg4 + 1 & 0x3]) {
                            arg10[1] = class392.field5936[var62][class425.method2563(3, var63 + 3)];
                        }
                    } else if (!var15[arg4 + 1 & 0x3]) {
                        arg10[1] = class334.field4849[var62][class425.method2563(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg9 == null) {
            return;
        }
        int var68 = class284.method1682(arg13, 26685, arg9);
        if (!arg9.field4880) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg4 * 2) & 0x7;
            if (class275.field3592[arg12][var69] && arg9.field4874 >= class512.field7210[var70]) {
                class112.field1711[var70] = arg9.field4876;
                class476.field6816[var70] = var68;
                class14.field325[var70] = arg9.field4881;
                class332.field4827[var70] = arg9.field4870;
                if (class512.field7210[var70] == arg9.field4874) {
                    class572.field8304[var70] = class151.method1076(class572.field8304[var70], 2);
                } else {
                    class572.field8304[var70] = 2;
                }
                class512.field7210[var70] = arg9.field4874;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "([[[ILr;I[Lwg;)V")
    public final void method3855(int[][][] arg0, class98 arg1, int arg2, class516[] arg3) {
        field9739++;
        if (!this.field9738) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field9729; var6++) {
                    for (int var7 = 0; var7 < this.field9720; var7++) {
                        if ((class317.field4622[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class317.field4622[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method2918(var7, var6, (byte) 96);
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != -5631) {
            this.field9735 = null;
        }
        for (int var9 = 0; var9 < this.field9722; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field9738) {
                if (class430.field6257) {
                    var11 |= 0x8;
                }
                if (class678.field9598) {
                    var10 |= 0x2;
                }
                if (class181.field2502 != 0) {
                    if (var9 == 0 | class180.field2491) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class678.field9598) {
                var11 |= 0x7;
            }
            if (!class66.field1054) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || var9 >= arg0.length ? this.field9731[var9] : arg0[var9];
            class155.method1106(var9, arg1.method677(this.field9729, this.field9720, this.field9731[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBIIII)V")
    private final void method3856(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg3; var7 < arg2 + arg3; var7++) {
            for (int var10 = arg5; var10 < arg0 + arg5; var10++) {
                if (var10 >= 0 && this.field9729 > var10 && var7 >= 0 && this.field9720 > var7) {
                    this.field9731[arg4][var10][var7] = arg4 <= 0 ? 0 : this.field9731[arg4 - 1][var10][var7] - 960;
                }
            }
        }
        if (arg1 < 74) {
            this.field9737 = null;
        }
        field9742++;
        if (arg5 > 0 && arg5 < this.field9729) {
            for (int var8 = arg3 + 1; var8 < arg2 + arg3; var8++) {
                if (var8 >= 0 && this.field9720 > var8) {
                    this.field9731[arg4][arg5][var8] = this.field9731[arg4][arg5 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && this.field9720 > arg3) {
            for (int var9 = arg5 + 1; var9 < (arg5 + arg0); var9++) {
                if (var9 >= 0 && this.field9729 > var9) {
                    this.field9731[arg4][var9][arg3] = this.field9731[arg4][var9][arg3 - 1];
                }
            }
        }
        if (arg5 < 0 || arg3 < 0 || this.field9729 <= arg5 || this.field9720 <= arg3) {
            return;
        }
        if (arg4 == 0) {
            if (arg5 > 0 && this.field9731[arg4][arg5 - 1][arg3] != 0) {
                this.field9731[arg4][arg5][arg3] = this.field9731[arg4][arg5 - 1][arg3];
                return;
            }
            if (arg3 > 0 && this.field9731[arg4][arg5][arg3 - 1] != 0) {
                this.field9731[arg4][arg5][arg3] = this.field9731[arg4][arg5][arg3 - 1];
                return;
            }
            if (arg5 > 0 && arg3 > 0 && this.field9731[arg4][arg5 - 1][arg3 - 1] != 0) {
                this.field9731[arg4][arg5][arg3] = this.field9731[arg4][arg5 - 1][arg3 - 1];
                return;
            }
            return;
        }
        if (arg5 > 0 && this.field9731[arg4][arg5 - 1][arg3] != this.field9731[arg4 - 1][arg5 - 1][arg3]) {
            this.field9731[arg4][arg5][arg3] = this.field9731[arg4][arg5 - 1][arg3];
            return;
        }
        if (arg3 > 0 && this.field9731[arg4 - 1][arg5][arg3 - 1] != this.field9731[arg4][arg5][arg3 - 1]) {
            this.field9731[arg4][arg5][arg3] = this.field9731[arg4][arg5][arg3 - 1];
            return;
        }
        if (arg5 > 0 && arg3 > 0 && this.field9731[arg4 - 1][arg5 - 1][arg3 - 1] != this.field9731[arg4][arg5 - 1][arg3 - 1]) {
            this.field9731[arg4][arg5][arg3] = this.field9731[arg4][arg5 - 1][arg3 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILr;IIBI)Lda;")
    public static final class395 method3857(int arg0, int arg1, class98 arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = -95 / ((arg5 + 7) / 44);
        field9732++;
        long var8 = (long) arg1;
        class395 var10 = (class395) class642.field9200.method3901(var8, -111);
        short var11 = 2055;
        if (var10 == null) {
            class677 var12 = class177.method1208(-29831, arg1, class638.field9171, 0);
            if (var12 == null) {
                return null;
            }
            if (var12.field9563 < 13) {
                var12.method3807(0, 2);
            }
            var10 = arg2.method651(var12, var11, class587.field8521, 64, 768);
            class642.field9200.method3894(var10, (byte) 60, var8);
        }
        class395 var13 = var10.method1038((byte) 2, var11, true);
        if (arg4 != 0) {
            var13.method1042(arg4);
        }
        if (arg3 != 0) {
            var13.method1048(arg3);
        }
        if (arg6 != 0) {
            var13.method1044(arg6);
        }
        if (arg0 != 0) {
            var13.method1019(0, arg0, 0);
        }
        return var13;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Li;Lr;Li;Li;[[IIB)V")
    private final void method3858(class682 arg0, class98 arg1, class682 arg2, class682 arg3, int[][] arg4, int arg5, byte arg6) {
        if (arg6 < 83) {
            return;
        }
        for (int var8 = 0; var8 < this.field9729; var8++) {
            for (int var9 = 0; var9 < this.field9720; var9++) {
                if (class565.field8250 == -1 || class257.method1538(112, var9, class565.field8250, var8, arg5)) {
                    byte var10 = this.field9746[arg5][var8][var9];
                    byte var11 = this.field9723[arg5][var8][var9];
                    int var12 = this.field9721[arg5][var8][var9] & 0xFF;
                    int var13 = this.field9734[arg5][var8][var9] & 0xFF;
                    class335 var14 = var12 == 0 ? null : this.field9735.method2472(4, var12 - 1);
                    class520 var15 = var13 == 0 ? null : this.field9737.method2789(124, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class2.field16[var10];
                        var17 = var14 == null ? 0 : class392.field5933[var10];
                    } else if (var14 != null) {
                        var17 = class392.field5933[var10];
                    } else if (var15 != null) {
                        var16 = class392.field5933[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20;
                        if (class377.field5665) {
                            var20 = var14 == null ? -1 : var14.field4881;
                        } else {
                            var20 = -1;
                        }
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        boolean var25 = false;
                        if (var14 != null && (var14.field4876 != -1 || var14.field4882 != -1 || var20 != -1)) {
                            for (int var26 = 0; var26 < var17; var26++) {
                                var23[var19] = var20;
                                var24[var19] = var14.field4870;
                                if (var14.field4876 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field4876;
                                }
                                if (var14.field4882 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var22[var19] = var14.field4882;
                                    var25 = true;
                                }
                                var19++;
                            }
                            if (!this.field9738 && arg5 == 0) {
                                class696.method3910(var8, var9, var14.field4878, var14.field4883 * 8, var14.field4873);
                            }
                        } else {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        }
                        if (!var25) {
                            var22 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field7281;
                            if (class377.field5665) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var23[var19] = var29;
                                var24[var19] = var15.field7282;
                                var21[var19] = arg4[var8][var9];
                                if (var22 != null) {
                                    var22[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field9733.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg0 == null ? null : new int[var31];
                        int[] var35 = arg0 == null && arg3 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var46 = this.field9733[var36];
                            int var47 = this.field9741[var36];
                            if (var11 == 0) {
                                var32[var36] = var46;
                                var33[var36] = var47;
                            } else if (var11 == 1) {
                                var32[var36] = var47;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var46;
                                var33[var36] = 512 - var47;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var47;
                                var33[var36] = var46;
                            }
                            if (var34 != null && class275.field3592[var10][var36]) {
                                int var50 = (var8 << 9) + var46;
                                int var51 = (var9 << 9) + var46;
                                var34[var36] = arg0.method3824(var50, 109, var51) - arg2.method3824(var50, 124, var51);
                            }
                            if (var35 != null) {
                                if (arg0 != null && !class275.field3592[var10][var36]) {
                                    int var52 = (var8 << 9) + var46;
                                    int var53 = (var9 << 9) + var46;
                                    var35[var36] = arg2.method3824(var52, 116, var53) - arg0.method3824(var52, 115, var53);
                                } else if (arg3 != null && !class444.field6445[var10][var36]) {
                                    int var54 = (var8 << 9) + var46;
                                    int var55 = (var9 << 9) + var46;
                                    var35[var36] = arg3.method3824(var54, 121, var55) - arg2.method3824(var54, 119, var55);
                                }
                            }
                        }
                        int var37 = arg2.method3822(var9, var8, 0);
                        int var38 = arg2.method3822(var9, var8 + 1, 0);
                        int var39 = arg2.method3822(var9 + 1, var8 + 1, 0);
                        int var40 = arg2.method3822(var9 + 1, var8, 0);
                        boolean var41 = class125.method898(-38, var8, var9);
                        if (var41 && arg5 > 1 || !var41 && arg5 > 0) {
                            boolean var42 = true;
                            if (var15 != null && !var15.field7283) {
                                var42 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var42 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field4867) {
                                var42 = false;
                            }
                            if (var42 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field9728[arg5][var8][var9] = (byte) class151.method1076(this.field9728[arg5][var8][var9], 4);
                            }
                        }
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        if (this.field9738) {
                            var43 = class418.method2539(var8, var9);
                            var44 = class11.method76(var8, var9);
                            var45 = class620.method3568(var8, var9);
                        }
                        arg2.method2167(var8, var9, var32, var34, var33, var35, class446.field6478[var10], class478.field6839[var10], client.field1430[var10], var21, var22, var23, var24, var43, var44, var45, false);
                        class699.method3921(arg5, var8, var9);
                    }
                }
            }
        }
        field9725++;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Li;Li;BLr;)V")
    public final void method3859(class682 arg0, class682 arg1, byte arg2, class98 arg3) {
        field9744++;
        if (class164.field2303 == null || class164.field2303.length != this.field9720) {
            class591.field8587 = new int[this.field9720];
            class400.field6022 = new int[this.field9720];
            class464.field6680 = new int[this.field9720];
            class370.field5482 = new int[this.field9720];
            class164.field2303 = new int[this.field9720];
        }
        int[][] var5 = new int[this.field9729][this.field9720];
        for (int var6 = 0; var6 < this.field9722; var6++) {
            for (int var9 = 0; var9 < this.field9720; var9++) {
                class164.field2303[var9] = 0;
                class464.field6680[var9] = 0;
                class591.field8587[var9] = 0;
                class370.field5482[var9] = 0;
                class400.field6022[var9] = 0;
            }
            for (int var10 = -5; var10 < this.field9729; var10++) {
                for (int var11 = 0; var11 < this.field9720; var11++) {
                    int var20 = var10 + 5;
                    int var10002;
                    if (var20 < this.field9729) {
                        int var21 = this.field9734[var6][var20][var11] & 0xFF;
                        if (var21 > 0) {
                            class520 var22 = this.field9737.method2789(101, var21 - 1);
                            class164.field2303[var11] += var22.field7286;
                            class464.field6680[var11] += var22.field7293;
                            class591.field8587[var11] += var22.field7298;
                            class370.field5482[var11] += var22.field7289;
                            var10002 = class400.field6022[var11]++;
                        }
                    }
                    int var23 = var10 - 5;
                    if (var23 >= 0) {
                        int var24 = this.field9734[var6][var23][var11] & 0xFF;
                        if (var24 > 0) {
                            class520 var25 = this.field9737.method2789(124, var24 - 1);
                            class164.field2303[var11] -= var25.field7286;
                            class464.field6680[var11] -= var25.field7293;
                            class591.field8587[var11] -= var25.field7298;
                            class370.field5482[var11] -= var25.field7289;
                            var10002 = class400.field6022[var11]--;
                        }
                    }
                }
                if (var10 >= 0) {
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = -5; var17 < this.field9720; var17++) {
                        int var18 = var17 + 5;
                        if (this.field9720 > var18) {
                            var16 += class400.field6022[var18];
                            var14 += class591.field8587[var18];
                            var15 += class370.field5482[var18];
                            var12 += class164.field2303[var18];
                            var13 += class464.field6680[var18];
                        }
                        int var19 = var17 - 5;
                        if (var19 >= 0) {
                            var12 -= class164.field2303[var19];
                            var14 -= class591.field8587[var19];
                            var13 -= class464.field6680[var19];
                            var16 -= class400.field6022[var19];
                            var15 -= class370.field5482[var19];
                        }
                        if (var17 >= 0 && var15 > 0 && var16 > 0) {
                            var5[var10][var17] = class257.method1540(var12 * 256 / var15, var14 / var16, var13 / var16, -1613418582);
                        }
                    }
                }
            }
            if (class138.field2016) {
                this.method3867(var6 == 0 ? arg0 : null, arg3, true, var6, class178.field2480[var6], var6 == 0 ? arg1 : null, var5);
            } else {
                this.method3858(var6 == 0 ? arg0 : null, arg3, class178.field2480[var6], var6 == 0 ? arg1 : null, var5, var6, (byte) 127);
            }
            this.field9734[var6] = null;
            this.field9721[var6] = null;
            this.field9746[var6] = null;
            this.field9723[var6] = null;
        }
        if (!this.field9738) {
            if (class181.field2502 != 0) {
                class168.method1171();
            }
            if (class678.field9598) {
                class329.method2032();
            }
        }
        int var7 = -29 / ((12 - arg2) / 44);
        for (int var8 = 0; var8 < this.field9722; var8++) {
            class178.field2480[var8].method2175();
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[[II)V")
    public final void method3860(int arg0, int[][] arg1, int arg2) {
        field9718++;
        if (arg2 != -2128096759) {
            return;
        }
        int[][] var4 = this.field9731[arg0];
        for (int var5 = 0; var5 < this.field9729 + 1; var5++) {
            for (int var6 = 0; var6 < this.field9720 + 1; var6++) {
                var4[var5][var6] += arg1[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILgk;IIIIII[Lwg;)V")
    public final void method3861(int arg0, int arg1, class540 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class516[] arg9) {
        field9726++;
        int var11 = (arg4 & 0x7) * 8;
        if (!this.field9738) {
            class516 var12 = arg9[arg5];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class518.method2929(var13 & 0x7, arg0, (byte) -123, var14 & 0x7) + arg3;
                    int var16 = arg7 + class417.method2534(var13 & 0x7, 0, arg0, var14 & 0x7);
                    if (var15 > 0 && var15 < this.field9729 - 1 && var16 > 0 && var16 < (this.field9720 - 1)) {
                        var12.method2906(var16, var15, false);
                    }
                }
            }
        }
        int var17 = (arg8 & 0x7) * 8;
        int var18 = (arg4 & 0xFFFFFFF8) << 3;
        int var19 = arg8 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg6 != -1) {
            this.field9731 = null;
        }
        if (arg0 == 1) {
            var21 = 1;
        } else if (arg0 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg0 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field9722; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg1 == var22 && var11 <= var23 && var11 + 8 >= var23 && var24 >= var17 && (var17 + 8) >= var24) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var17 + 8) == var24) {
                            if (arg0 == 0) {
                                var25 = arg3 + var23 - var11;
                                var26 = arg7 - (var17 - var24);
                            } else if (arg0 == 1) {
                                var26 = arg7 + 8 - (-var11 + var23);
                                var25 = arg3 + var24 - var17;
                            } else if (arg0 == 2) {
                                var25 = var11 - (var23 - (arg3 + 8));
                                var26 = var17 + arg7 + 8 - var24;
                            } else {
                                var26 = var23 + arg7 - var11;
                                var25 = var17 + arg3 + 8 - var24;
                            }
                            this.method3864(0, 1274368514, var18 + var23, var19 - -var24, arg5, true, 0, arg2, 0, var25, var26);
                        } else {
                            var25 = arg3 + class518.method2929(var23 & 0x7, arg0, (byte) -75, var24 & 0x7);
                            var26 = class417.method2534(var23 & 0x7, 0, arg0, var24 & 0x7) + arg7;
                            this.method3864(arg0, 1274368514, var18 + var23, var19 + var24, arg5, false, var20, arg2, var21, var25, var26);
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
                                if (arg0 == 0) {
                                    var31 = var30 - (var17 - arg7);
                                    var32 = arg3 + var29 - var11;
                                } else if (arg0 == 1) {
                                    var32 = arg3 + var30 - var17;
                                    var31 = var11 + arg7 + 8 - var29;
                                } else if (arg0 == 2) {
                                    var31 = var17 + arg7 + 8 - var30;
                                    var32 = arg3 + 8 - (var29 - var11);
                                } else {
                                    var31 = arg7 - (var11 - var29);
                                    var32 = arg3 + 8 - (var30 - var17);
                                }
                                if (var32 >= 0 && this.field9729 > var32 && var31 >= 0 && var31 < this.field9720) {
                                    this.field9731[arg5][var32][var31] = this.field9731[arg5][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method3864(0, 1274368514, 0, 0, 0, false, 0, arg2, 0, -1, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIII)V")
    public final void method3862(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9745++;
        if (arg1 == 3) {
            for (int var6 = 0; var6 < this.field9722; var6++) {
                this.method3856(arg2, (byte) 85, arg4, arg0, var6, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static void method3863(int arg0) {
        field9736 = null;
        int var1 = 10 % ((32 - arg0) / 50);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIZILgk;III)V")
    private final void method3864(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class540 arg7, int arg8, int arg9, int arg10) {
        if (arg0 == 1) {
            arg8 = 1;
        } else if (arg0 == 2) {
            arg6 = 1;
            arg8 = 1;
        } else if (arg0 == 3) {
            arg6 = 1;
        }
        if (arg1 != 1274368514) {
            return;
        }
        field9740++;
        if (arg9 < 0 || this.field9729 <= arg9 || arg10 < 0 || arg10 >= this.field9720) {
            while (true) {
                int var14 = arg7.method3115(29871);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg7.method3115(29871);
                    return;
                }
                if (var14 <= 49) {
                    arg7.method3115(29871);
                }
            }
        }
        if (!this.field9738 && !arg5) {
            class317.field4622[arg4][arg9][arg10] = 0;
        }
        while (true) {
            int var12 = arg7.method3115(29871);
            if (var12 == 0) {
                if (this.field9738) {
                    this.field9731[0][arg6 + arg9][arg8 + arg10] = 0;
                    return;
                } else if (arg4 == 0) {
                    this.field9731[0][arg6 + arg9][arg8 + arg10] = -class276.method1637(arg2 + 932731, arg1 + -1274368525, arg3 + 556238) * 8 << 2;
                    return;
                } else {
                    this.field9731[arg4][arg6 + arg9][arg10 + arg8] = this.field9731[arg4 - 1][arg6 + arg9][arg8 + arg10] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg7.method3115(29871);
                if (this.field9738) {
                    this.field9731[0][arg6 + arg9][arg8 + arg10] = var13 * 8 << 2;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg4 == 0) {
                    this.field9731[0][arg6 + arg9][arg8 + arg10] = -var13 * 8 << 2;
                    return;
                }
                this.field9731[arg4][arg9 + arg6][arg8 + arg10] = this.field9731[arg4 - 1][arg6 + arg9][arg8 + arg10] - (var13 * 8 << 2);
                return;
            }
            if (var12 <= 49) {
                if (arg5) {
                    arg7.method3115(29871);
                } else {
                    this.field9721[arg4][arg9][arg10] = arg7.method3128(32767);
                    this.field9746[arg4][arg9][arg10] = (byte) ((var12 - 2) / 4);
                    this.field9723[arg4][arg9][arg10] = (byte) class425.method2563(arg0 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field9738 && !arg5) {
                    class317.field4622[arg4][arg9][arg10] = (byte) (var12 - 49);
                }
            } else if (!arg5) {
                this.field9734[arg4][arg9][arg10] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lgk;III[Lwg;II)V")
    public final void method3865(class540 arg0, int arg1, int arg2, int arg3, class516[] arg4, int arg5, int arg6) {
        if (!this.field9738) {
            for (int var8 = 0; var8 < 4; var8++) {
                class516 var9 = arg4[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg5 + var10;
                        int var13 = arg1 + var11;
                        if (var12 >= 0 && this.field9729 > var12 && var13 >= 0 && var13 < this.field9720) {
                            var9.method2906(var13, var12, false);
                        }
                    }
                }
            }
        }
        field9724++;
        if (arg3 != 1) {
            return;
        }
        int var14 = arg2 + arg5;
        int var15 = arg1 + arg6;
        for (int var16 = 0; var16 < this.field9722; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method3864(0, arg3 ^ 0x4BF55203, var14 + var17, var15 - -var18, var16, false, 0, arg0, 0, var17 + arg5, var18 - -arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I[B)Z")
    public static final boolean method3866(int arg0, byte[] arg1) {
        field9719++;
        class540 var2 = new class540(arg1);
        int var3 = var2.method3115(29871);
        if (arg0 >= -53) {
            method3857(-92, -21, null, 56, -44, (byte) 102, 51);
        }
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method3115(29871) == 1;
        if (var4) {
            class693.method3907((byte) -62, var2);
        }
        class38.method220(var2, (byte) -37);
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Li;Lr;ZILi;Li;[[I)V")
    private final void method3867(class682 arg0, class98 arg1, boolean arg2, int arg3, class682 arg4, class682 arg5, int[][] arg6) {
        field9727++;
        byte[][] var8 = this.field9746[arg3];
        byte[][] var9 = this.field9723[arg3];
        if (!arg2) {
            this.field9721 = null;
        }
        byte[][] var10 = this.field9734[arg3];
        byte[][] var11 = this.field9721[arg3];
        for (int var12 = 0; var12 < this.field9729; var12++) {
            int var13 = this.field9729 - 1 > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field9720; var14++) {
                int var15 = var14 >= (this.field9720 - 1) ? var14 : var14 + 1;
                if (class565.field8250 == -1 || class257.method1538(74, var14, class565.field8250, var12, arg3)) {
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
                        class335 var26 = var21 == 0 ? null : this.field9735.method2472(4, var21 - 1);
                        class520 var27 = var22 == 0 ? null : this.field9737.method2789(-59, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class335 var28 = var26;
                        if (var26 != null) {
                            if (var26.field4876 == -1 && var26.field4882 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field4880;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field9729 > var12 && this.field9720 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var33 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var35--;
                                var33--;
                            }
                            if (var10[var13][var14] == var22) {
                                var35++;
                                var32++;
                            } else {
                                var35--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var32++;
                            } else {
                                var32--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var33--;
                                var36--;
                            }
                            int var37 = var33 - var32;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg4.method3822(var14, var12, 0) - arg4.method3822(var15, var13, 0);
                                var38 = arg4.method3822(var14, var13, 0) - arg4.method3822(var15, var12, 0);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 >= var38 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class512.field7210[var39] = -1;
                            class572.field8304[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field4880 ? class392.field5936[var19] : class334.field4849[var19];
                        this.method3854(-99, var11, this.field9729, var14, var20, var27, var12, var9, var8, var26, var18, this.field9720, var19, arg1);
                        boolean var41 = var26 != null && var26.field4882 != var26.field4876;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class512.field7210[var42] >= 0 && class476.field6816[var42] != class112.field1711[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class216.method1365(var18[1], class425.method2563(class572.field8304[2], class572.field8304[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class216.method1365(var18[3], class425.method2563(class572.field8304[0], class572.field8304[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class216.method1365(var18[0], class425.method2563(class572.field8304[2], class572.field8304[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class216.method1365(var18[2], class425.method2563(class572.field8304[6], class572.field8304[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var19 = var19 == 0 ? 13 : 14;
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
                        int[] var45;
                        int[] var46;
                        int var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var45 = client.field1430[var19];
                            var46 = class446.field6478[var19];
                            var47 = var26 == null ? 0 : class392.field5933[var19];
                            var48 = var27 == null ? 0 : class2.field16[var19];
                            var49 = class478.field6839[var19];
                        } else if (var17) {
                            var47 = var26 == null ? 0 : class563.field8229[var19];
                            var45 = class395.field5982[var19];
                            var49 = class134.field1936[var19];
                            var44 = class239.field3154[var19];
                            var48 = var27 == null ? 0 : class279.field3691[var19];
                            var46 = class70.field1088[var19];
                        } else {
                            var46 = class288.field4176[var19];
                            var47 = var26 == null ? 0 : class169.field2390[var19];
                            var44 = class594.field8606[var19];
                            var49 = class281.field3718[var19];
                            var48 = var27 == null ? 0 : class554.field8138[var19];
                            var45 = class7.field213[var19];
                        }
                        int var50 = var47 + var48;
                        if (var50 <= 0) {
                            class699.method3921(arg3, var12, var14);
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
                            int[] var61 = arg0 == null && arg5 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var64 = var26.field4870;
                                var62 = var26.field4876;
                                var63 = var26.field4881;
                                int var65 = class284.method1682(arg1, 26685, var26);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class64.field1006[0] = var46[var51];
                                        class64.field1006[1] = 1;
                                        class64.field1006[2] = var45[var51];
                                        class64.field1006[3] = 1;
                                        class64.field1006[4] = var49[var51];
                                        var99 = 6;
                                        class64.field1006[5] = var45[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class64.field1006[0] = var46[var51];
                                        class64.field1006[1] = 5;
                                        class64.field1006[2] = var45[var51];
                                        class64.field1006[3] = 5;
                                        class64.field1006[4] = var49[var51];
                                        class64.field1006[5] = var45[var51];
                                        var99 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class64.field1006[0] = var46[var51];
                                        class64.field1006[1] = 3;
                                        class64.field1006[2] = var45[var51];
                                        class64.field1006[3] = 3;
                                        class64.field1006[4] = var49[var51];
                                        class64.field1006[5] = var45[var51];
                                        var99 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class64.field1006[0] = var46[var51];
                                        class64.field1006[1] = 7;
                                        class64.field1006[2] = var45[var51];
                                        class64.field1006[3] = 7;
                                        class64.field1006[4] = var49[var51];
                                        class64.field1006[5] = var45[var51];
                                        var99 = 6;
                                    } else {
                                        class64.field1006[0] = var46[var51];
                                        class64.field1006[1] = var49[var51];
                                        class64.field1006[2] = var45[var51];
                                        var99 = 3;
                                    }
                                    var51++;
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class64.field1006[var100];
                                        int var102 = var101 - (var20 * 2) & 0x7;
                                        int var103 = this.field9733[var101];
                                        int var104 = this.field9741[var101];
                                        int var105;
                                        int var106;
                                        if (var20 == 1) {
                                            var106 = var104;
                                            var105 = 512 - var103;
                                        } else if (var20 == 2) {
                                            var105 = 512 - var104;
                                            var106 = 512 - var103;
                                        } else if (var20 == 3) {
                                            var106 = 512 - var104;
                                            var105 = var103;
                                        } else {
                                            var105 = var104;
                                            var106 = var103;
                                        }
                                        var55[var52] = var106;
                                        var56[var52] = var105;
                                        if (var60 != null && class275.field3592[var19][var101]) {
                                            int var107 = (var12 << 9) + var106;
                                            int var108 = (var14 << 9) + var105;
                                            var60[var52] = arg0.method3824(var107, 127, var108) - arg4.method3824(var107, 115, var108);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class275.field3592[var19][var101]) {
                                                int var109 = (var12 << 9) + var106;
                                                int var110 = (var14 << 9) + var105;
                                                var61[var52] = arg4.method3824(var109, 118, var110) - arg0.method3824(var109, 123, var110);
                                            } else if (arg5 != null && !class444.field6445[var19][var101]) {
                                                int var111 = (var12 << 9) + var106;
                                                int var112 = (var14 << 9) + var105;
                                                var61[var52] = arg5.method3824(var111, 110, var112) - arg4.method3824(var111, 120, var112);
                                            }
                                        }
                                        if (var101 < 8 && class512.field7210[var102] > var26.field4874) {
                                            if (var54 != null) {
                                                var54[var52] = class476.field6816[var102];
                                            }
                                            var59[var52] = class332.field4827[var102];
                                            var58[var52] = class14.field325[var102];
                                            var57[var52] = class112.field1711[var102];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field4881;
                                            var59[var52] = var26.field4870;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field9738 && arg3 == 0) {
                                    class696.method3910(var12, var14, var26.field4878, var26.field4883 * 8, var26.field4873);
                                }
                                if (var19 != 12 && var26.field4876 != -1 && var26.field4884) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class392.field5933[var19];
                            } else if (var17) {
                                var51 += class563.field8229[var19];
                            } else {
                                var51 += class169.field2390[var19];
                            }
                            if (var27 != null) {
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class520 var67 = this.field9737.method2789(-68, var22 - 1);
                                class520 var68 = this.field9737.method2789(-102, var23 - 1);
                                class520 var69 = this.field9737.method2789(87, var24 - 1);
                                class520 var70 = this.field9737.method2789(109, var25 - 1);
                                for (int var71 = 0; var71 < var48; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class64.field1006[0] = var46[var51];
                                        class64.field1006[1] = 1;
                                        class64.field1006[2] = var45[var51];
                                        class64.field1006[3] = 1;
                                        class64.field1006[4] = var49[var51];
                                        class64.field1006[5] = var45[var51];
                                        var73 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class64.field1006[0] = var46[var51];
                                        class64.field1006[1] = 5;
                                        class64.field1006[2] = var45[var51];
                                        class64.field1006[3] = 5;
                                        class64.field1006[4] = var49[var51];
                                        var73 = 6;
                                        class64.field1006[5] = var45[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class64.field1006[0] = var46[var51];
                                        class64.field1006[1] = 3;
                                        class64.field1006[2] = var45[var51];
                                        class64.field1006[3] = 3;
                                        class64.field1006[4] = var49[var51];
                                        class64.field1006[5] = var45[var51];
                                        var73 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class64.field1006[0] = var46[var51];
                                        class64.field1006[1] = 7;
                                        class64.field1006[2] = var45[var51];
                                        class64.field1006[3] = 7;
                                        class64.field1006[4] = var49[var51];
                                        var73 = 6;
                                        class64.field1006[5] = var45[var51];
                                    } else {
                                        class64.field1006[0] = var46[var51];
                                        class64.field1006[1] = var49[var51];
                                        class64.field1006[2] = var45[var51];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class64.field1006[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field9733[var75];
                                        int var78 = this.field9741[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = 512 - var77;
                                            var80 = var78;
                                        } else if (var20 == 2) {
                                            var79 = 512 - var78;
                                            var80 = 512 - var77;
                                        } else if (var20 == 3) {
                                            var80 = 512 - var78;
                                            var79 = var77;
                                        } else {
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class275.field3592[var19][var75]) {
                                            int var81 = (var12 << 9) + var80;
                                            int var82 = (var14 << 9) + var79;
                                            var60[var52] = arg0.method3824(var81, 122, var82) - arg4.method3824(var81, 120, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class275.field3592[var19][var75]) {
                                                int var83 = (var12 << 9) + var80;
                                                int var84 = (var14 << 9) + var79;
                                                var61[var52] = arg4.method3824(var83, 123, var84) - arg0.method3824(var83, 121, var84);
                                            } else if (arg5 != null && !class444.field6445[var19][var75]) {
                                                int var85 = (var12 << 9) + var80;
                                                int var86 = (var14 << 9) + var79;
                                                var61[var52] = arg5.method3824(var85, 114, var86) - arg4.method3824(var85, 121, var86);
                                            }
                                        }
                                        if (var75 < 8 && class512.field7210[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class476.field6816[var76];
                                            }
                                            var59[var52] = class332.field4827[var76];
                                            var58[var52] = class14.field325[var76];
                                            var57[var52] = class112.field1711[var76];
                                        } else {
                                            if (var17 && class275.field3592[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg6[var12][var14];
                                                var58[var52] = var67.field7281;
                                                var59[var52] = var67.field7282;
                                            } else if (var80 == 0 && var79 == 512) {
                                                var57[var52] = arg6[var12][var15];
                                                var58[var52] = var68.field7281;
                                                var59[var52] = var68.field7282;
                                            } else if (var80 == 512 && var79 == 512) {
                                                var57[var52] = arg6[var13][var15];
                                                var58[var52] = var69.field7281;
                                                var59[var52] = var69.field7282;
                                            } else if (var80 == 512 && var79 == 0) {
                                                var57[var52] = arg6[var13][var14];
                                                var58[var52] = var70.field7281;
                                                var59[var52] = var70.field7282;
                                            } else {
                                                if (var80 < 256) {
                                                    if (var79 >= 256) {
                                                        var58[var52] = var68.field7281;
                                                        var59[var52] = var68.field7282;
                                                    } else {
                                                        var58[var52] = var67.field7281;
                                                        var59[var52] = var67.field7282;
                                                    }
                                                } else if (var79 >= 256) {
                                                    var58[var52] = var69.field7281;
                                                    var59[var52] = var69.field7282;
                                                } else {
                                                    var58[var52] = var70.field7281;
                                                    var59[var52] = var70.field7282;
                                                }
                                                int var87 = class652.method3691(arg6[var13][var14], -93, arg6[var12][var14], var80 << 7 >> 9);
                                                int var88 = class652.method3691(arg6[var13][var15], -100, arg6[var12][var15], var80 << 7 >> 9);
                                                var57[var52] = class652.method3691(var88, 108, var87, var79 << 7 >> 9);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field7299) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg4.method3822(var14, var12, 0);
                            int var90 = arg4.method3822(var14, var13, 0);
                            int var91 = arg4.method3822(var15, var13, 0);
                            int var92 = arg4.method3822(var15, var12, 0);
                            boolean var93 = class125.method898(-105, var12, var14);
                            if (var93 && arg3 > 1 || !var93 && arg3 > 0) {
                                boolean var94 = true;
                                if (var27 != null && !var27.field7283) {
                                    var94 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var94 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field4867) {
                                    var94 = false;
                                }
                                if (var94 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field9728[arg3][var12][var14] = (byte) class151.method1076(this.field9728[arg3][var12][var14], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field9738) {
                                var95 = class418.method2539(var12, var14);
                                var96 = class11.method76(var12, var14);
                                var97 = class620.method3568(var12, var14);
                            }
                            arg4.method2184(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var95, var96, var97, var16);
                            class699.method3921(arg3, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(IIIZLsf;Lll;)V")
    public class690(int arg0, int arg1, int arg2, boolean arg3, class397 arg4, class488 arg5) {
        this.field9735 = arg4;
        this.field9738 = arg3;
        this.field9729 = arg1;
        this.field9720 = arg2;
        this.field9722 = arg0;
        this.field9737 = arg5;
        this.field9728 = new byte[this.field9722][this.field9729 + 1][this.field9720 + 1];
        this.field9723 = new byte[this.field9722][this.field9729][this.field9720];
        this.field9746 = new byte[this.field9722][this.field9729][this.field9720];
        this.field9721 = new byte[this.field9722][this.field9729][this.field9720];
        this.field9731 = new int[this.field9722][this.field9729 + 1][this.field9720 + 1];
        this.field9734 = new byte[this.field9722][this.field9729][this.field9720];
    }
}
