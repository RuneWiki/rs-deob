import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class531 {

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[I")
    private int[] field7772 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
    private int[] field7785 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public int field7794;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public int field7775;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Z")
    public boolean field7784;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lpv;")
    private class52 field7786;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "Ldq;")
    private class501 field7799;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public int field7796;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "[[[B")
    public byte[][][] field7787;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "[[[B")
    private byte[][][] field7788;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[[[B")
    private byte[][][] field7778;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "[[[B")
    private byte[][][] field7783;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "[[[I")
    public int[][][] field7791;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[[[B")
    private byte[][][] field7768;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[Z")
    public static boolean[] field7773 = new boolean[100];

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Z")
    public static boolean field7777 = false;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field7779;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field7782;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field7789;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field7790;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field7792;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!hd", name = "G", descriptor = "Ldh;")
    public static class214 field7800;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "[[[B")
    public byte[][][] field7793;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILdh;)I")
    public static final int method3118(int arg0, class214 arg1) {
        field7770++;
        if (arg0 != 0) {
            method3123(-43, (byte) -82, -17, 20, 107, -74, 19, 109, -2);
        }
        String var2 = class120.method809(-32060, arg1);
        int[] var3 = null;
        if (class308.method1869(arg1.field3094, (byte) -121)) {
            var3 = class344.field5000.method993((int) arg1.field3089, true).field5534;
        } else if (arg1.field3085 != -1) {
            var3 = class344.field5000.method993(arg1.field3085, true).field5534;
        } else if (class26.method168(arg1.field3094, 205)) {
            class378 var6 = (class378) class125.field1687.method2405((long) ((int) arg1.field3089), -47);
            if (var6 != null) {
                class429 var7 = var6.field5353;
                class322 var8 = var7.field6055;
                if (var8.field4693 != null) {
                    var8 = var8.method1939(15964, class163.field2413);
                }
                if (var8 != null) {
                    var3 = var8.field4680;
                }
            }
        } else if (class350.method2072(arg1.field3094, (byte) 110)) {
            Object var4 = null;
            class270 var5;
            if (arg1.field3094 == 1002) {
                var5 = class377.field5338.method1901(50, (int) arg1.field3089);
            } else {
                var5 = class377.field5338.method1901(50, (int) (arg1.field3089 >>> 32 & 0x7FFFFFFFL));
            }
            if (var5.field3998 != null) {
                var5 = var5.method1704((byte) 6, class163.field2413);
            }
            if (var5 != null) {
                var3 = var5.field3934;
            }
        }
        if (var3 != null) {
            var2 = var2 + class440.method2579(var3, false);
        }
        int var9 = class113.field1536.method2434(true, var2, class487.field6796);
        if (arg1.field3086) {
            var9 += class328.field4785.method146() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI[[I)V")
    public final void method3119(byte arg0, int arg1, int[][] arg2) {
        field7790++;
        int[][] var4 = this.field7791[arg1];
        for (int var5 = 0; var5 < (this.field7775 + 1); var5++) {
            for (int var6 = 0; var6 < this.field7794 + 1; var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
        if (arg0 >= -77) {
            this.field7794 = -101;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZIIIIILwm;II)V")
    private final void method3120(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class403 arg8, int arg9, int arg10) {
        if (arg9 == 1) {
            arg10 = 1;
        } else if (arg9 == 2) {
            arg1 = 1;
            arg10 = 1;
        } else if (arg9 == 3) {
            arg1 = 1;
        }
        field7798++;
        if (arg4 > -7) {
            this.method3130(-122, 84, 44, 98, -2, null, -52, null, 28, 27);
        }
        if (arg7 < 0 || this.field7775 <= arg7 || arg3 < 0 || this.field7794 <= arg3) {
            while (true) {
                int var14 = arg8.method2357((byte) 120);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg8.method2357((byte) 115);
                    return;
                }
                if (var14 <= 49) {
                    arg8.method2357((byte) 106);
                }
            }
        }
        if (!this.field7784 && !arg2) {
            class368.field5253[arg5][arg7][arg3] = 0;
        }
        while (true) {
            int var12 = arg8.method2357((byte) 104);
            if (var12 == 0) {
                if (this.field7784) {
                    this.field7791[0][arg1 + arg7][arg3 + arg10] = 0;
                    return;
                } else if (arg5 == 0) {
                    this.field7791[0][arg1 + arg7][arg3 + arg10] = -class116.method778(arg6 + 932731, arg0 + 556238, 35) * 8 << 0;
                    return;
                } else {
                    this.field7791[arg5][arg1 + arg7][arg3 + arg10] = this.field7791[arg5 - 1][arg1 + arg7][arg3 + arg10] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg8.method2357((byte) 118);
                if (!this.field7784) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg5 != 0) {
                        this.field7791[arg5][arg7 + arg1][arg3 + arg10] = this.field7791[arg5 - 1][arg7 + arg1][arg3 + arg10] - (var13 * 8 << 0);
                        return;
                    }
                    this.field7791[0][arg1 + arg7][arg3 + arg10] = -var13 * 8 << 0;
                    return;
                }
                this.field7791[0][arg7 + arg1][arg3 + arg10] = var13 * 8 << 0;
                return;
            }
            if (var12 <= 49) {
                if (arg2) {
                    arg8.method2357((byte) 108);
                } else {
                    this.field7788[arg5][arg7][arg3] = arg8.method2359(6);
                    this.field7783[arg5][arg7][arg3] = (byte) ((var12 - 2) / 4);
                    this.field7768[arg5][arg7][arg3] = (byte) class239.method1507(3, var12 + arg9 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field7784 && !arg2) {
                    class368.field5253[arg5][arg7][arg3] = (byte) (var12 - 49);
                }
            } else if (!arg2) {
                this.field7778[arg5][arg7][arg3] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lya;Lya;Lza;[[IIILya;)V")
    private final void method3121(class38 arg0, class38 arg1, class290 arg2, int[][] arg3, int arg4, int arg5, class38 arg6) {
        field7771++;
        if (arg4 != 28807) {
            return;
        }
        byte[][] var8 = this.field7783[arg5];
        byte[][] var9 = this.field7768[arg5];
        byte[][] var10 = this.field7778[arg5];
        byte[][] var11 = this.field7788[arg5];
        for (int var12 = 0; var12 < this.field7775; var12++) {
            int var13 = var12 >= (this.field7775 - 1) ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field7794; var14++) {
                int var15 = var14 < (this.field7794 - 1) ? var14 + 1 : var14;
                if (class6.field95 == -1 || class36.method205(class6.field95, 0, var12, var14, arg5)) {
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
                        class105 var26 = var21 == 0 ? null : this.field7786.method415((byte) -32, var21 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class168 var27 = var22 == 0 ? null : this.field7799.method2912(var22 - 1, false);
                        class105 var28 = var26;
                        if (var26 != null) {
                            if (var26.field1377 == -1 && var26.field1381 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field1376;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field7775 > var12 && this.field7794 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var34 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var33++;
                            } else {
                                var33--;
                                var35--;
                            }
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var34++;
                                var33++;
                            } else {
                                var34--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var34--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var35--;
                                var36--;
                            }
                            int var37 = var35 - var34;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg1.method10(var12, var14) - arg1.method10(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg1.method10(var13, var14) - arg1.method10(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class437.field6137[var39] = -1;
                            class310.field4515[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field1376 ? class503.field7202[var19] : class81.field1051[var19];
                        this.method3122(var20, arg2, var19, var11, var8, true, var18, this.field7794, var9, this.field7775, var26, var12, var27, var14);
                        boolean var41 = var26 != null && var26.field1381 != var26.field1377;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class437.field6137[var42] >= 0 && class343.field4987[var42] != class262.field3861[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class41.method236(var18[1], class239.method1507(class310.field4515[2], class310.field4515[4]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class41.method236(var18[3], class239.method1507(class310.field4515[0], class310.field4515[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class41.method236(var18[0], class239.method1507(class310.field4515[2], class310.field4515[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class41.method236(var18[2], class239.method1507(class310.field4515[6], class310.field4515[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[1] = var18[2] = false;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                                var18[2] = var18[3] = false;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int var45;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        if (var43) {
                            var45 = var26 == null ? 0 : class194.field2760[var19];
                            var46 = class174.field2514[var19];
                            var47 = class222.field3206[var19];
                            var48 = var27 == null ? 0 : class502.field7101[var19];
                            var49 = class171.field2484[var19];
                        } else if (var17) {
                            var49 = class198.field2813[var19];
                            var44 = class530.field7760[var19];
                            var46 = class318.field4598[var19];
                            var47 = class386.field5425[var19];
                            var45 = var26 == null ? 0 : class110.field1499[var19];
                            var48 = var27 == null ? 0 : class4.field79[var19];
                        } else {
                            var45 = var26 == null ? 0 : class482.field6712[var19];
                            var48 = var27 == null ? 0 : class240.field3500[var19];
                            var47 = class265.field3882[var19];
                            var44 = class103.field1365[var19];
                            var49 = class477.field6648[var19];
                            var46 = class466.field6515[var19];
                        }
                        int var50 = var45 + var48;
                        if (var50 <= 0) {
                            class232.method1431(arg5, var12, var14);
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
                            int[] var60 = arg6 == null ? null : new int[var53];
                            int[] var61 = arg6 == null && arg0 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field1377;
                                var63 = arg2.method317() ? var26.field1385 : var26.field1374;
                                var64 = var26.field1386;
                                int var65 = class96.method681(arg2, var26, arg4 - 28551);
                                for (int var66 = 0; var66 < var45; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class23.field306[0] = var49[var51];
                                        class23.field306[1] = 1;
                                        class23.field306[2] = var46[var51];
                                        class23.field306[3] = 1;
                                        class23.field306[4] = var47[var51];
                                        class23.field306[5] = var46[var51];
                                        var98 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class23.field306[0] = var49[var51];
                                        class23.field306[1] = 5;
                                        class23.field306[2] = var46[var51];
                                        class23.field306[3] = 5;
                                        class23.field306[4] = var47[var51];
                                        class23.field306[5] = var46[var51];
                                        var98 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class23.field306[0] = var49[var51];
                                        class23.field306[1] = 3;
                                        class23.field306[2] = var46[var51];
                                        class23.field306[3] = 3;
                                        class23.field306[4] = var47[var51];
                                        var98 = 6;
                                        class23.field306[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class23.field306[0] = var49[var51];
                                        class23.field306[1] = 7;
                                        class23.field306[2] = var46[var51];
                                        class23.field306[3] = 7;
                                        class23.field306[4] = var47[var51];
                                        class23.field306[5] = var46[var51];
                                        var98 = 6;
                                    } else {
                                        class23.field306[0] = var49[var51];
                                        class23.field306[1] = var47[var51];
                                        class23.field306[2] = var46[var51];
                                        var98 = 3;
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class23.field306[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field7785[var100];
                                        int var103 = this.field7772[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = 128 - var102;
                                            var105 = var103;
                                        } else if (var20 == 2) {
                                            var104 = 128 - var103;
                                            var105 = 128 - var102;
                                        } else if (var20 == 3) {
                                            var104 = var102;
                                            var105 = 128 - var103;
                                        } else {
                                            var105 = var102;
                                            var104 = var103;
                                        }
                                        var55[var52] = var105;
                                        var56[var52] = var104;
                                        if (var60 != null && class156.field2353[var19][var100]) {
                                            int var106 = (var12 << 7) + var105;
                                            int var107 = (var14 << 7) + var104;
                                            var60[var52] = arg6.method11(var106, var107) - arg1.method11(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class156.field2353[var19][var100]) {
                                                int var108 = (var12 << 7) + var105;
                                                int var109 = (var14 << 7) + var104;
                                                var61[var52] = arg1.method11(var108, var109) - arg6.method11(var108, var109);
                                            } else if (arg0 != null && !class194.field2761[var19][var100]) {
                                                int var110 = (var12 << 7) + var105;
                                                int var111 = (var14 << 7) + var104;
                                                var61[var52] = arg0.method11(var110, var111) - arg1.method11(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && class437.field6137[var101] > var26.field1373) {
                                            if (var54 != null) {
                                                var54[var52] = class343.field4987[var101];
                                            }
                                            var59[var52] = class36.field399[var101];
                                            var58[var52] = class408.field5767[var101];
                                            var57[var52] = class262.field3861[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg2.method317() ? var26.field1385 : var26.field1374;
                                            var59[var52] = var26.field1386;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field7784 && arg5 == 0) {
                                    class261.method1672(var12, var14, var26.field1379, var26.field1387 * 8, var26.field1372);
                                }
                                if (var19 != 12 && var26.field1377 != -1 && var26.field1380) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class194.field2760[var19];
                            } else if (var17) {
                                var51 += class110.field1499[var19];
                            } else {
                                var51 += class482.field6712[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class168 var67 = this.field7799.method2912(var22 - 1, false);
                                class168 var68 = this.field7799.method2912(var23 - 1, false);
                                class168 var69 = this.field7799.method2912(var24 - 1, false);
                                class168 var70 = this.field7799.method2912(var25 - 1, false);
                                for (int var71 = 0; var71 < var48; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class23.field306[0] = var49[var51];
                                        class23.field306[1] = 1;
                                        class23.field306[2] = var46[var51];
                                        class23.field306[3] = 1;
                                        class23.field306[4] = var47[var51];
                                        var73 = 6;
                                        class23.field306[5] = var46[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class23.field306[0] = var49[var51];
                                        class23.field306[1] = 5;
                                        class23.field306[2] = var46[var51];
                                        class23.field306[3] = 5;
                                        class23.field306[4] = var47[var51];
                                        class23.field306[5] = var46[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class23.field306[0] = var49[var51];
                                        class23.field306[1] = 3;
                                        class23.field306[2] = var46[var51];
                                        class23.field306[3] = 3;
                                        class23.field306[4] = var47[var51];
                                        var73 = 6;
                                        class23.field306[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class23.field306[0] = var49[var51];
                                        class23.field306[1] = 7;
                                        class23.field306[2] = var46[var51];
                                        class23.field306[3] = 7;
                                        class23.field306[4] = var47[var51];
                                        class23.field306[5] = var46[var51];
                                        var73 = 6;
                                    } else {
                                        class23.field306[0] = var49[var51];
                                        class23.field306[1] = var47[var51];
                                        var73 = 3;
                                        class23.field306[2] = var46[var51];
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class23.field306[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field7785[var75];
                                        int var78 = this.field7772[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var80 = var78;
                                            var79 = 128 - var77;
                                        } else if (var20 == 2) {
                                            var79 = 128 - var78;
                                            var80 = 128 - var77;
                                        } else if (var20 == 3) {
                                            var79 = var77;
                                            var80 = 128 - var78;
                                        } else {
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var55[var52] = var80;
                                        var56[var52] = var79;
                                        if (var60 != null && class156.field2353[var19][var75]) {
                                            int var81 = (var12 << 7) + var80;
                                            int var82 = (var14 << 7) + var79;
                                            var60[var52] = arg6.method11(var81, var82) - arg1.method11(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class156.field2353[var19][var75]) {
                                                int var83 = (var12 << 7) + var80;
                                                int var84 = (var14 << 7) + var79;
                                                var61[var52] = arg1.method11(var83, var84) - arg6.method11(var83, var84);
                                            } else if (arg0 != null && !class194.field2761[var19][var75]) {
                                                int var85 = (var12 << 7) + var80;
                                                int var86 = (var14 << 7) + var79;
                                                var61[var52] = arg0.method11(var85, var86) - arg1.method11(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class437.field6137[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class343.field4987[var76];
                                            }
                                            var59[var52] = class36.field399[var76];
                                            var58[var52] = class408.field5767[var76];
                                            var57[var52] = class262.field3861[var76];
                                        } else {
                                            if (var17 && class156.field2353[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var57[var52] = arg3[var12][var14];
                                                var58[var52] = var67.field2440;
                                                var59[var52] = var67.field2439;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var57[var52] = arg3[var12][var15];
                                                var58[var52] = var68.field2440;
                                                var59[var52] = var68.field2439;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var57[var52] = arg3[var13][var15];
                                                var58[var52] = var69.field2440;
                                                var59[var52] = var69.field2439;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var57[var52] = arg3[var13][var14];
                                                var58[var52] = var70.field2440;
                                                var59[var52] = var70.field2439;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var79 < 64) {
                                                        var58[var52] = var67.field2440;
                                                        var59[var52] = var67.field2439;
                                                    } else {
                                                        var58[var52] = var68.field2440;
                                                        var59[var52] = var68.field2439;
                                                    }
                                                } else if (var79 < 64) {
                                                    var58[var52] = var70.field2440;
                                                    var59[var52] = var70.field2439;
                                                } else {
                                                    var58[var52] = var69.field2440;
                                                    var59[var52] = var69.field2439;
                                                }
                                                int var87 = class192.method1223(var80 << 7 >> 7, -31, arg3[var12][var14], arg3[var13][var14]);
                                                int var88 = class192.method1223(var80 << 7 >> 7, -72, arg3[var12][var15], arg3[var13][var15]);
                                                var57[var52] = class192.method1223(var79 << 7 >> 7, -102, var87, var88);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field2446) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg1.method10(var12, var14);
                            int var90 = arg1.method10(var13, var14);
                            int var91 = arg1.method10(var13, var15);
                            int var92 = arg1.method10(var12, var15);
                            if (arg5 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field1378) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field7787[arg5][var12][var14] = (byte) class170.method1067(this.field7787[arg5][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field7784) {
                                var94 = class40.method230(var12, var14);
                                var95 = class513.method3058(var12, var14);
                                var96 = class471.method2727(var12, var14);
                            }
                            arg1.method12(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class232.method1431(arg5, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILza;I[[B[[BZ[ZI[[BILd;ILae;I)V")
    private final void method3122(int arg0, class290 arg1, int arg2, byte[][] arg3, byte[][] arg4, boolean arg5, boolean[] arg6, int arg7, byte[][] arg8, int arg9, class105 arg10, int arg11, class168 arg12, int arg13) {
        field7792++;
        boolean[] var15 = arg10 != null && arg10.field1376 ? class503.field7202[arg2] : class81.field1051[arg2];
        if (arg13 > 0) {
            if (arg11 > 0) {
                int var16 = arg3[arg11 - 1][arg13 - 1] & 0xFF;
                if (var16 > 0) {
                    class105 var17 = this.field7786.method415((byte) -32, var16 - 1);
                    if (var17.field1377 != -1 && var17.field1376) {
                        byte var18 = arg4[arg11 - 1][arg13 - 1];
                        int var19 = arg8[arg11 - 1][arg13 - 1] * 2 + 4 & 0x7;
                        int var20 = class96.method681(arg1, var17, 256);
                        if (class156.field2353[var18][var19]) {
                            class262.field3861[0] = var17.field1377;
                            class343.field4987[0] = var20;
                            class408.field5767[0] = arg1.method317() ? var17.field1385 : var17.field1374;
                            class36.field399[0] = var17.field1386;
                            class437.field6137[0] = var17.field1373;
                            class310.field4515[0] = 256;
                        }
                    }
                }
            }
            if (arg11 < (arg9 - 1)) {
                int var21 = arg3[arg11 + 1][arg13 - 1] & 0xFF;
                if (var21 > 0) {
                    class105 var22 = this.field7786.method415((byte) -32, var21 - 1);
                    if (var22.field1377 != -1 && var22.field1376) {
                        byte var23 = arg4[arg11 + 1][arg13 - 1];
                        int var24 = arg8[arg11 + 1][arg13 - 1] * 2 + 6 & 0x7;
                        int var25 = class96.method681(arg1, var22, 256);
                        if (class156.field2353[var23][var24]) {
                            class262.field3861[2] = var22.field1377;
                            class343.field4987[2] = var25;
                            class408.field5767[2] = arg1.method317() ? var22.field1385 : var22.field1374;
                            class36.field399[2] = var22.field1386;
                            class437.field6137[2] = var22.field1373;
                            class310.field4515[2] = 512;
                        }
                    }
                }
            }
        }
        if ((arg7 - 1) > arg13) {
            if (arg11 > 0) {
                int var26 = arg3[arg11 - 1][arg13 + 1] & 0xFF;
                if (var26 > 0) {
                    class105 var27 = this.field7786.method415((byte) -32, var26 - 1);
                    if (var27.field1377 != -1 && var27.field1376) {
                        byte var28 = arg4[arg11 - 1][arg13 + 1];
                        int var29 = arg8[arg11 - 1][arg13 + 1] * 2 + 2 & 0x7;
                        int var30 = class96.method681(arg1, var27, 256);
                        if (class156.field2353[var28][var29]) {
                            class262.field3861[6] = var27.field1377;
                            class343.field4987[6] = var30;
                            class408.field5767[6] = arg1.method317() ? var27.field1385 : var27.field1374;
                            class36.field399[6] = var27.field1386;
                            class437.field6137[6] = var27.field1373;
                            class310.field4515[6] = 64;
                        }
                    }
                }
            }
            if ((arg9 - 1) > arg11) {
                int var31 = arg3[arg11 + 1][arg13 + 1] & 0xFF;
                if (var31 > 0) {
                    class105 var32 = this.field7786.method415((byte) -32, var31 - 1);
                    if (var32.field1377 != -1 && var32.field1376) {
                        byte var33 = arg4[arg11 + 1][arg13 + 1];
                        int var34 = arg8[arg11 + 1][arg13 + 1] * 2 & 0x7;
                        int var35 = class96.method681(arg1, var32, 256);
                        if (class156.field2353[var33][var34]) {
                            class262.field3861[4] = var32.field1377;
                            class343.field4987[4] = var35;
                            class408.field5767[4] = arg1.method317() ? var32.field1385 : var32.field1374;
                            class36.field399[4] = var32.field1386;
                            class437.field6137[4] = var32.field1373;
                            class310.field4515[4] = 128;
                        }
                    }
                }
            }
        }
        if (!arg5) {
            this.method3125(-123, null, 109, -96, -62, null, -76);
        }
        if (arg13 > 0) {
            int var36 = arg3[arg11][arg13 - 1] & 0xFF;
            if (var36 > 0) {
                class105 var37 = this.field7786.method415((byte) -32, var36 - 1);
                if (var37.field1377 != -1) {
                    byte var38 = arg4[arg11][arg13 - 1];
                    byte var39 = arg8[arg11][arg13 - 1];
                    if (var37.field1376) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class96.method681(arg1, var37, 256);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var41 &= 0x7;
                            var40 &= 0x7;
                            if (class156.field2353[var38][var41] && class437.field6137[var40] <= var37.field1373) {
                                class262.field3861[var40] = var37.field1377;
                                class343.field4987[var40] = var42;
                                class408.field5767[var40] = arg1.method317() ? var37.field1385 : var37.field1374;
                                class36.field399[var40] = var37.field1386;
                                if (class437.field6137[var40] == var37.field1373) {
                                    class310.field4515[var40] = class170.method1067(class310.field4515[var40], 32);
                                } else {
                                    class310.field4515[var40] = 32;
                                }
                                class437.field6137[var40] = var37.field1373;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg0 & 0x3]) {
                            arg6[0] = class503.field7202[var38][class239.method1507(3, var39 + 2)];
                        }
                    } else if (!var15[arg0 & 0x3]) {
                        arg6[0] = class81.field1051[var38][class239.method1507(3, var39 + 2)];
                    }
                }
            }
        }
        if ((arg7 - 1) > arg13) {
            int var44 = arg3[arg11][arg13 + 1] & 0xFF;
            if (var44 > 0) {
                class105 var45 = this.field7786.method415((byte) -32, var44 - 1);
                if (var45.field1377 != -1) {
                    byte var46 = arg4[arg11][arg13 + 1];
                    byte var47 = arg8[arg11][arg13 + 1];
                    if (var45.field1376) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class96.method681(arg1, var45, 256);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class156.field2353[var46][var49] && class437.field6137[var48] <= var45.field1373) {
                                class262.field3861[var48] = var45.field1377;
                                class343.field4987[var48] = var50;
                                class408.field5767[var48] = arg1.method317() ? var45.field1385 : var45.field1374;
                                class36.field399[var48] = var45.field1386;
                                if (class437.field6137[var48] == var45.field1373) {
                                    class310.field4515[var48] = class170.method1067(class310.field4515[var48], 16);
                                } else {
                                    class310.field4515[var48] = 16;
                                }
                                class437.field6137[var48] = var45.field1373;
                            }
                            var49--;
                            var48++;
                        }
                        if (!var15[arg0 + 2 & 0x3]) {
                            arg6[2] = class503.field7202[var46][class239.method1507(-(-var47), 3)];
                        }
                    } else if (!var15[arg0 + 2 & 0x3]) {
                        arg6[2] = class81.field1051[var46][class239.method1507(var47, 3)];
                    }
                }
            }
        }
        if (arg11 > 0) {
            int var52 = arg3[arg11 - 1][arg13] & 0xFF;
            if (var52 > 0) {
                class105 var53 = this.field7786.method415((byte) -32, var52 - 1);
                if (var53.field1377 != -1) {
                    byte var54 = arg4[arg11 - 1][arg13];
                    byte var55 = arg8[arg11 - 1][arg13];
                    if (var53.field1376) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class96.method681(arg1, var53, 256);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class156.field2353[var54][var57] && var53.field1373 >= class437.field6137[var56]) {
                                class262.field3861[var56] = var53.field1377;
                                class343.field4987[var56] = var58;
                                class408.field5767[var56] = arg1.method317() ? var53.field1385 : var53.field1374;
                                class36.field399[var56] = var53.field1386;
                                if (class437.field6137[var56] == var53.field1373) {
                                    class310.field4515[var56] = class170.method1067(class310.field4515[var56], 8);
                                } else {
                                    class310.field4515[var56] = 8;
                                }
                                class437.field6137[var56] = var53.field1373;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg0 + 3 & 0x3]) {
                            arg6[3] = class503.field7202[var54][class239.method1507(3, var55 + 1)];
                        }
                    } else if (!var15[arg0 + 3 & 0x3]) {
                        arg6[3] = class81.field1051[var54][class239.method1507(3, var55 + 1)];
                    }
                }
            }
        }
        if (arg11 < (arg9 - 1)) {
            int var60 = arg3[arg11 + 1][arg13] & 0xFF;
            if (var60 > 0) {
                class105 var61 = this.field7786.method415((byte) -32, var60 - 1);
                if (var61.field1377 != -1) {
                    byte var62 = arg4[arg11 + 1][arg13];
                    byte var63 = arg8[arg11 + 1][arg13];
                    if (var61.field1376) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class96.method681(arg1, var61, 256);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var64 &= 0x7;
                            var65 &= 0x7;
                            if (class156.field2353[var62][var65] && var61.field1373 >= class437.field6137[var64]) {
                                class262.field3861[var64] = var61.field1377;
                                class343.field4987[var64] = var66;
                                class408.field5767[var64] = arg1.method317() ? var61.field1385 : var61.field1374;
                                class36.field399[var64] = var61.field1386;
                                if (class437.field6137[var64] == var61.field1373) {
                                    class310.field4515[var64] = class170.method1067(class310.field4515[var64], 4);
                                } else {
                                    class310.field4515[var64] = 4;
                                }
                                class437.field6137[var64] = var61.field1373;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg0 + 1 & 0x3]) {
                            arg6[1] = class503.field7202[var62][class239.method1507(3, var63 + 3)];
                        }
                    } else if (!var15[arg0 + 1 & 0x3]) {
                        arg6[1] = class81.field1051[var62][class239.method1507(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg10 == null) {
            return;
        }
        int var68 = class96.method681(arg1, arg10, 256);
        if (!arg10.field1376) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg0 * 2) & 0x7;
            if (class156.field2353[arg2][var69] && arg10.field1373 >= class437.field6137[var70]) {
                class262.field3861[var70] = arg10.field1377;
                class343.field4987[var70] = var68;
                class408.field5767[var70] = arg1.method317() ? arg10.field1385 : arg10.field1374;
                class36.field399[var70] = arg10.field1386;
                if (class437.field6137[var70] == arg10.field1373) {
                    class310.field4515[var70] = class170.method1067(class310.field4515[var70], 2);
                } else {
                    class310.field4515[var70] = 2;
                }
                class437.field6137[var70] = arg10.field1373;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBIIIIIII)V")
    public static final void method3123(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = 98 / ((arg1 + 8) / 37);
        field7782++;
        class58.method478(arg4, arg7, arg8, arg3, arg6, arg5, 0, arg0, arg2, 78);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lya;Lza;BILya;Lya;[[I)V")
    private final void method3124(class38 arg0, class290 arg1, byte arg2, int arg3, class38 arg4, class38 arg5, int[][] arg6) {
        if (arg2 > -31) {
            field7777 = true;
        }
        field7781++;
        for (int var8 = 0; var8 < this.field7775; var8++) {
            for (int var9 = 0; var9 < this.field7794; var9++) {
                if (class6.field95 == -1 || class36.method205(class6.field95, 0, var8, var9, arg3)) {
                    byte var10 = this.field7783[arg3][var8][var9];
                    byte var11 = this.field7768[arg3][var8][var9];
                    int var12 = this.field7788[arg3][var8][var9] & 0xFF;
                    int var13 = this.field7778[arg3][var8][var9] & 0xFF;
                    class105 var14 = var12 == 0 ? null : this.field7786.method415((byte) -32, var12 - 1);
                    class168 var15 = var13 == 0 ? null : this.field7799.method2912(var13 - 1, false);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class502.field7101[var10];
                        var17 = var14 == null ? 0 : class194.field2760[var10];
                    } else if (var14 != null) {
                        var17 = class194.field2760[var10];
                    } else if (var15 != null) {
                        var16 = class194.field2760[var10];
                    }
                    int var18 = var17 + var16;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field1377 == -1 && var14.field1381 == -1 && var14.field1385 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg1.method317() ? var14.field1385 : var14.field1374;
                            if (class362.field5184) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field1386;
                                if (var14.field1377 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field1377;
                                }
                                if (var14.field1381 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field1381;
                                }
                                var19++;
                            }
                            if (!this.field7784 && arg3 == 0) {
                                class261.method1672(var8, var9, var14.field1379, var14.field1387 * 8, var14.field1372);
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
                            int var29 = var15.field2440;
                            if (class362.field5184) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field2439;
                                var20[var19] = arg6[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field7785.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg4 == null ? null : new int[var31];
                        int[] var35 = arg4 == null && arg5 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field7785[var36];
                            int var46 = this.field7772[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class156.field2353[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg4.method11(var49, var50) - arg0.method11(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg4 != null && !class156.field2353[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg0.method11(var51, var52) - arg4.method11(var51, var52);
                                } else if (arg5 != null && !class194.field2761[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg5.method11(var53, var54) - arg0.method11(var53, var54);
                                }
                            }
                        }
                        int var37 = arg0.method10(var8, var9);
                        int var38 = arg0.method10(var8 + 1, var9);
                        int var39 = arg0.method10(var8 + 1, var9 - -1);
                        int var40 = arg0.method10(var8, var9 + 1);
                        if (arg3 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field1378) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field7787[arg3][var8][var9] = (byte) class170.method1067(this.field7787[arg3][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field7784) {
                            var42 = class40.method230(var8, var9);
                            var43 = class513.method3058(var8, var9);
                            var44 = class471.method2727(var8, var9);
                        }
                        arg0.method5(var8, var9, var32, var34, var33, var35, class171.field2484[var10], class222.field3206[var10], class174.field2514[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class232.method1431(arg3, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILwm;III[Lmk;I)V")
    public final void method3125(int arg0, class403 arg1, int arg2, int arg3, int arg4, class40[] arg5, int arg6) {
        if (!this.field7784) {
            for (int var8 = 0; var8 < 4; var8++) {
                class40 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg0 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && var12 < this.field7775 && var13 >= 0 && var13 < this.field7794) {
                            var9.method217(var13, 81, var12);
                        }
                    }
                }
            }
        }
        field7801++;
        if (arg6 != -1) {
            field7776 = -109;
        }
        int var14 = arg0 + arg2;
        int var15 = arg4 + arg3;
        for (int var16 = 0; var16 < this.field7796; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method3120(var15 + var18, 0, false, arg3 + var18, arg6 + -64, var16, var14 + var17, arg0 + var17, arg1, 0, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lcv;I)V")
    public static final void method3126(class407 arg0, int arg1) {
        if (arg0.field5764 != null) {
            arg0.field5764.field112 = 0;
        }
        field7769++;
        arg0.field5762 = false;
        int var2 = 5 / ((arg1 + 39) / 59);
        for (class407 var3 = arg0.method520(); var3 != null; var3 = arg0.method511()) {
            method3126(var3, 20);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lza;[Lmk;I[[[I)V")
    public final void method3127(class290 arg0, class40[] arg1, int arg2, int[][][] arg3) {
        field7780++;
        if (!this.field7784) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field7775; var6++) {
                    for (int var7 = 0; var7 < this.field7794; var7++) {
                        if ((class368.field5253[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class368.field5253[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method229(var6, var7, 2097152);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = arg2; var9 < this.field7796; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field7784) {
                if (class172.field2497) {
                    var10 |= 0x2;
                }
                if (field7777) {
                    var11 |= 0x8;
                }
                if (class326.field4753 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class478.field6656) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class172.field2497) {
                var11 |= 0x7;
            }
            if (!class254.field3758) {
                var11 |= 0x20;
            }
            int[][] var12 = arg3 == null || var9 >= arg3.length ? this.field7791[var9] : arg3[var9];
            class287.method1770(var9, arg0.method314(this.field7775, this.field7794, this.field7791[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method3128(int arg0) {
        field7773 = null;
        if (arg0 != -2) {
            field7779 = 82;
        }
        field7800 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZIII)V")
    private final void method3129(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field7774++;
        for (int var7 = arg3; var7 < (arg3 + arg4); var7++) {
            for (int var10 = arg5; var10 < arg1 + arg5; var10++) {
                if (var10 >= 0 && var10 < this.field7775 && var7 >= 0 && this.field7794 > var7) {
                    this.field7791[arg0][var10][var7] = arg0 <= 0 ? 0 : this.field7791[arg0 - 1][var10][var7] - 240;
                }
            }
        }
        if (arg5 > 0 && this.field7775 > arg5) {
            for (int var8 = arg3 + 1; var8 < (arg3 + arg4); var8++) {
                if (var8 >= 0 && this.field7794 > var8) {
                    this.field7791[arg0][arg5][var8] = this.field7791[arg0][arg5 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < this.field7794) {
            for (int var9 = arg5 + 1; var9 < arg1 + arg5; var9++) {
                if (var9 >= 0 && var9 < this.field7775) {
                    this.field7791[arg0][var9][arg3] = this.field7791[arg0][var9][arg3 - 1];
                }
            }
        }
        if (arg5 >= 0 && arg3 >= 0 && arg5 < this.field7775 && this.field7794 > arg3) {
            if (arg0 == 0) {
                if (arg5 > 0 && this.field7791[arg0][arg5 - 1][arg3] != 0) {
                    this.field7791[arg0][arg5][arg3] = this.field7791[arg0][arg5 - 1][arg3];
                } else if (arg3 > 0 && this.field7791[arg0][arg5][arg3 - 1] != 0) {
                    this.field7791[arg0][arg5][arg3] = this.field7791[arg0][arg5][arg3 - 1];
                } else if (arg5 > 0 && arg3 > 0 && this.field7791[arg0][arg5 - 1][arg3 - 1] != 0) {
                    this.field7791[arg0][arg5][arg3] = this.field7791[arg0][arg5 - 1][arg3 - 1];
                }
            } else if (arg5 > 0 && this.field7791[arg0 - 1][arg5 - 1][arg3] != this.field7791[arg0][arg5 - 1][arg3]) {
                this.field7791[arg0][arg5][arg3] = this.field7791[arg0][arg5 - 1][arg3];
            } else if (arg3 > 0 && this.field7791[arg0 - 1][arg5][arg3 - 1] != this.field7791[arg0][arg5][arg3 - 1]) {
                this.field7791[arg0][arg5][arg3] = this.field7791[arg0][arg5][arg3 - 1];
            } else if (arg5 > 0 && arg3 > 0 && this.field7791[arg0][arg5 - 1][arg3 - 1] != this.field7791[arg0 - 1][arg5 - 1][arg3 - 1]) {
                this.field7791[arg0][arg5][arg3] = this.field7791[arg0][arg5 - 1][arg3 - 1];
            }
        }
        if (!arg2) {
            method3128(-84);
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIZLpv;Ldq;)V")
    public class531(int arg0, int arg1, int arg2, boolean arg3, class52 arg4, class501 arg5) {
        this.field7794 = arg2;
        this.field7775 = arg1;
        this.field7784 = arg3;
        this.field7786 = arg4;
        this.field7799 = arg5;
        this.field7796 = arg0;
        this.field7787 = new byte[this.field7796][this.field7775 + 1][this.field7794 + 1];
        this.field7788 = new byte[this.field7796][this.field7775][this.field7794];
        this.field7778 = new byte[this.field7796][this.field7775][this.field7794];
        this.field7783 = new byte[this.field7796][this.field7775][this.field7794];
        this.field7791 = new int[this.field7796][this.field7775 + 1][this.field7794 + 1];
        this.field7768 = new byte[this.field7796][this.field7775][this.field7794];
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIILwm;I[Lmk;II)V")
    public final void method3130(int arg0, int arg1, int arg2, int arg3, int arg4, class403 arg5, int arg6, class40[] arg7, int arg8, int arg9) {
        field7797++;
        int var11 = (arg9 & 0x7) * 8;
        int var12 = (arg4 & 0x7) * 8;
        if (!this.field7784) {
            class40 var13 = arg7[arg2];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg0 + class181.method1125(var15 & 0x7, arg8, 31290, var14 & 0x7);
                    int var17 = class41.method234(false, var15 & 0x7, var14 & 0x7, arg8) + arg1;
                    if (var16 > 0 && var16 < (this.field7775 - 1) && var17 > 0 && this.field7794 - 1 > var17) {
                        var13.method217(var17, -38, var16);
                    }
                }
            }
        }
        int var18 = arg9 & 0x1FFFFFF8 << 3;
        if (arg3 != 5) {
            return;
        }
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
        for (int var22 = 0; var22 < this.field7796; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg6 == var22 && var11 <= var23 && var23 <= (var11 + 8) && var24 >= var12 && (var12 + 8) >= var24) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var12 + 8 == var24) {
                            if (arg8 == 0) {
                                var25 = arg0 - (var11 - var23);
                                var26 = var24 + arg1 - var12;
                            } else if (arg8 == 1) {
                                var26 = arg1 + var11 + 8 - var23;
                                var25 = arg0 + var24 - var12;
                            } else if (arg8 == 2) {
                                var25 = arg0 + 8 - (-var11 + var23);
                                var26 = arg1 + var12 + 8 - var24;
                            } else {
                                var26 = arg1 + var23 - var11;
                                var25 = arg0 + var12 - (var24 - 8);
                            }
                            this.method3120(var19 + var24, 0, true, var26, -37, arg2, var18 + var23, var25, arg5, 0, 0);
                        } else {
                            var25 = class181.method1125(var24 & 0x7, arg8, 31290, var23 & 0x7) + arg0;
                            var26 = class41.method234(false, var24 & 0x7, var23 & 0x7, arg8) + arg1;
                            this.method3120(var19 + var24, var20, false, var26, -45, arg2, var18 + var23, var25, arg5, arg8, var21);
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
                                    var31 = arg0 - (var11 - var29);
                                    var32 = arg1 - (var12 - var30);
                                } else if (arg8 == 1) {
                                    var31 = var30 + arg0 - var12;
                                    var32 = var11 - (var29 - arg1 - 8);
                                } else if (arg8 == 2) {
                                    var32 = arg1 - var30 - (-var12 - 8);
                                    var31 = var11 + arg0 + 8 - var29;
                                } else {
                                    var31 = var12 + arg0 + 8 - var30;
                                    var32 = var29 + arg1 - var11;
                                }
                                if (var31 >= 0 && var31 < this.field7775 && var32 >= 0 && this.field7794 > var32) {
                                    this.field7791[arg2][var31][var32] = this.field7791[arg2][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method3120(0, 0, false, -1, arg3 ^ -69, 0, 0, -1, arg5, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lza;Lya;ILya;)V")
    public final void method3131(class290 arg0, class38 arg1, int arg2, class38 arg3) {
        field7795++;
        if (class92.field1162 == null || class92.field1162.length != this.field7794) {
            class468.field6537 = new int[this.field7794];
            class117.field1634 = new int[this.field7794];
            class263.field3871 = new int[this.field7794];
            class92.field1162 = new int[this.field7794];
            class64.field814 = new int[this.field7794];
        }
        int[][] var5 = new int[this.field7775][this.field7794];
        for (int var6 = 0; var6 < this.field7796; var6++) {
            for (int var8 = 0; var8 < this.field7794; var8++) {
                class92.field1162[var8] = 0;
                class468.field6537[var8] = 0;
                class117.field1634[var8] = 0;
                class263.field3871[var8] = 0;
                class64.field814[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field7775; var9++) {
                for (int var10 = 0; var10 < this.field7794; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field7775) {
                        int var20 = this.field7778[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class168 var21 = this.field7799.method2912(var20 - 1, false);
                            class92.field1162[var10] += var21.field2447;
                            class468.field6537[var10] += var21.field2442;
                            class117.field1634[var10] += var21.field2438;
                            class263.field3871[var10] += var21.field2452;
                            var10002 = class64.field814[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field7778[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class168 var24 = this.field7799.method2912(var23 - 1, false);
                            class92.field1162[var10] -= var24.field2447;
                            class468.field6537[var10] -= var24.field2442;
                            class117.field1634[var10] -= var24.field2438;
                            class263.field3871[var10] -= var24.field2452;
                            var10002 = class64.field814[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field7794; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field7794) {
                            var13 += class117.field1634[var17];
                            var12 += class468.field6537[var17];
                            var11 += class92.field1162[var17];
                            var15 += class64.field814[var17];
                            var14 += class263.field3871[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var14 -= class263.field3871[var18];
                            var15 -= class64.field814[var18];
                            var13 -= class117.field1634[var18];
                            var12 -= class468.field6537[var18];
                            var11 -= class92.field1162[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class158.method1014(var11 * 256 / var14, var12 / var15, (byte) 117, var13 / var15);
                        }
                    }
                }
            }
            if (class129.field1721) {
                this.method3121(var6 == 0 ? arg3 : null, class330.field4818[var6], arg0, var5, 28807, var6, var6 == 0 ? arg1 : null);
            } else {
                this.method3124(class330.field4818[var6], arg0, (byte) -54, var6, var6 == 0 ? arg1 : null, var6 == 0 ? arg3 : null, var5);
            }
            this.field7778[var6] = null;
            this.field7788[var6] = null;
            this.field7783[var6] = null;
            this.field7768[var6] = null;
        }
        if (arg2 < 110) {
            this.field7799 = null;
        }
        if (!this.field7784) {
            if (class326.field4753 != 0) {
                class383.method2224();
            }
            if (class172.field2497) {
                class275.method1732();
            }
        }
        for (int var7 = 0; var7 < this.field7796; var7++) {
            class330.field4818[var7].method4();
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIB)V")
    public final void method3132(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 < -5) {
            for (int var6 = 0; var6 < this.field7796; var6++) {
                this.method3129(var6, arg3, true, arg0, arg1, arg2);
            }
            field7789++;
        }
    }
}
