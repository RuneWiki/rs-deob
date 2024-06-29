import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class221 {

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "[I")
    private int[] field2841 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "[I")
    private int[] field2846 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "Ler;")
    private class4 field2833;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Z")
    public boolean field2825;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Lvn;")
    private class261 field2831;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public int field2838;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "[[[B")
    private byte[][][] field2847;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "[[[B")
    private byte[][][] field2839;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "[[[B")
    public byte[][][] field2842;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[[[B")
    private byte[][][] field2823;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "[[[I")
    public int[][][] field2824;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "[[[B")
    private byte[][][] field2837;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Loi;")
    public static class169 field2826 = new class169(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Loi;")
    public static class169 field2832 = new class169("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "Ljd;")
    public static class408 field2845 = new class408(2, 4, 4, 0);

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "[[I")
    public static int[][] field2856 = new int[6][];

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field2857 = 0;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "F")
    public static float field2852;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Ldn;")
    public static class201 field2851;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ac", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field2858;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "[[Leo;")
    public static class423[][] field2855;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "[[[B")
    public byte[][][] field2835;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1417(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lna;Lna;Lqa;Lna;[[III)V", line = 4)
    private final void method1402(class251 arg0, class251 arg1, class129 arg2, class251 arg3, int[][] arg4, int arg5, int arg6) {
        field2822++;
        byte[][] var8 = this.field2847[arg5];
        byte[][] var9 = this.field2823[arg5];
        byte[][] var10 = this.field2839[arg5];
        byte[][] var11 = this.field2837[arg5];
        int var12 = 0;
        if (arg6 != 2) {
            return;
        }
        while (var12 < this.field2829) {
            int var13 = var12 < (this.field2829 - 1) ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field2819; var14++) {
                int var15 = this.field2819 - 1 > var14 ? var14 + 1 : var14;
                if (class306.field3945 == -1 || class303.method1818(var14, class306.field3945, -19236, var12, arg5)) {
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
                        class286 var26 = var21 == 0 ? null : this.field2833.method20(123, var21 - 1);
                        class2 var27 = var22 == 0 ? null : this.field2831.method1639(var22 - 1, 2);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class286 var28 = var26;
                        if (var26 != null) {
                            if (var26.field3655 == -1 && var26.field3648 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field3651;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field2829 > var12 && this.field2819 > var14) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            int var35 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var34++;
                            } else {
                                var35--;
                                var34--;
                            }
                            int var36 = var32 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var35++;
                            } else {
                                var35--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var33--;
                                var36--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var34++;
                                var36++;
                            } else {
                                var36--;
                                var34--;
                            }
                            int var37 = var34 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var35 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg3.method1187(var12, var14) - arg3.method1187(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg3.method1187(var13, var14) - arg3.method1187(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class107.field1460[var39] = -1;
                            class274.field3484[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field3651 ? class264.field3356[var19] : class71.field882[var19];
                        this.method1415(arg2, var11, var26, var14, var12, var20, var18, (byte) 60, var27, var8, var19, this.field2829, var9, this.field2819);
                        boolean var41 = var26 != null && var26.field3655 != var26.field3648;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class107.field1460[var42] >= 0 && class278.field3558[var42] != class13.field233[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class278.method1715(var18[1], class60.method339(class274.field3484[4], class274.field3484[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class278.method1715(var18[3], class60.method339(class274.field3484[6], class274.field3484[0]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class278.method1715(var18[0], class60.method339(class274.field3484[0], class274.field3484[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class278.method1715(var18[2], class60.method339(class274.field3484[6], class274.field3484[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 3;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var20 = 2;
                                var18[1] = var18[2] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                                var20 = 1;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int[] var46;
                        int var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var48 = class326.field4182[var19];
                            var46 = class275.field3509[var19];
                            var45 = class269.field3404[var19];
                            var47 = var26 == null ? 0 : class202.field2652[var19];
                            var49 = var27 == null ? 0 : class378.field4903[var19];
                        } else if (var17) {
                            var45 = class450.field6268[var19];
                            var46 = class21.field405[var19];
                            var47 = var26 == null ? 0 : class302.field3912[var19];
                            var44 = class185.field2426[var19];
                            var48 = class158.field2083[var19];
                            var49 = var27 == null ? 0 : class311.field4021[var19];
                        } else {
                            var46 = class501.field7366[var19];
                            var49 = var27 == null ? 0 : class165.field2136[var19];
                            var47 = var26 == null ? 0 : class64.field818[var19];
                            var44 = class431.field5946[var19];
                            var48 = class324.field4159[var19];
                            var45 = class331.field4253[var19];
                        }
                        int var50 = var47 + var49;
                        if (var50 <= 0) {
                            class234.method1482(arg5, var12, var14);
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
                            int[] var61 = arg0 == null && arg1 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field3655;
                                var63 = arg2.method890() ? var26.field3638 : var26.field3642;
                                var64 = var26.field3649;
                                int var65 = class466.method2812(var26, false, arg2);
                                for (int var66 = 0; var66 < var47; var66++) {
                                    boolean var97 = false;
                                    byte var98;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class485.field7054[0] = var45[var51];
                                        class485.field7054[1] = 1;
                                        class485.field7054[2] = var46[var51];
                                        class485.field7054[3] = 1;
                                        class485.field7054[4] = var48[var51];
                                        var98 = 6;
                                        class485.field7054[5] = var46[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class485.field7054[0] = var45[var51];
                                        class485.field7054[1] = 5;
                                        class485.field7054[2] = var46[var51];
                                        class485.field7054[3] = 5;
                                        class485.field7054[4] = var48[var51];
                                        class485.field7054[5] = var46[var51];
                                        var98 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class485.field7054[0] = var45[var51];
                                        class485.field7054[1] = 3;
                                        class485.field7054[2] = var46[var51];
                                        class485.field7054[3] = 3;
                                        class485.field7054[4] = var48[var51];
                                        var98 = 6;
                                        class485.field7054[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class485.field7054[0] = var45[var51];
                                        class485.field7054[1] = 7;
                                        class485.field7054[2] = var46[var51];
                                        class485.field7054[3] = 7;
                                        class485.field7054[4] = var48[var51];
                                        class485.field7054[5] = var46[var51];
                                        var98 = 6;
                                    } else {
                                        class485.field7054[0] = var45[var51];
                                        class485.field7054[1] = var48[var51];
                                        class485.field7054[2] = var46[var51];
                                        var98 = 3;
                                    }
                                    var51++;
                                    for (int var99 = 0; var99 < var98; var99++) {
                                        int var100 = class485.field7054[var99];
                                        int var101 = var100 - (var20 * 2) & 0x7;
                                        int var102 = this.field2841[var100];
                                        int var103 = this.field2846[var100];
                                        int var104;
                                        int var105;
                                        if (var20 == 1) {
                                            var104 = var103;
                                            var105 = 128 - var102;
                                        } else if (var20 == 2) {
                                            var104 = 128 - var102;
                                            var105 = 128 - var103;
                                        } else if (var20 == 3) {
                                            var105 = var102;
                                            var104 = 128 - var103;
                                        } else {
                                            var104 = var102;
                                            var105 = var103;
                                        }
                                        var55[var52] = var104;
                                        var56[var52] = var105;
                                        if (var60 != null && class25.field441[var19][var100]) {
                                            int var106 = (var12 << 7) + var104;
                                            int var107 = (var14 << 7) + var105;
                                            var60[var52] = arg0.method1185(var106, var107) - arg3.method1185(var106, var107);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class25.field441[var19][var100]) {
                                                int var108 = (var12 << 7) + var104;
                                                int var109 = (var14 << 7) + var105;
                                                var61[var52] = arg3.method1185(var108, var109) - arg0.method1185(var108, var109);
                                            } else if (arg1 != null && !class463.field6653[var19][var100]) {
                                                int var110 = (var12 << 7) + var104;
                                                int var111 = (var14 << 7) + var105;
                                                var61[var52] = arg1.method1185(var110, var111) - arg3.method1185(var110, var111);
                                            }
                                        }
                                        if (var100 < 8 && var26.field3641 < class107.field1460[var101]) {
                                            if (var54 != null) {
                                                var54[var52] = class13.field233[var101];
                                            }
                                            var59[var52] = class370.field4776[var101];
                                            var58[var52] = class314.field4048[var101];
                                            var57[var52] = class278.field3558[var101];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg2.method890() ? var26.field3638 : var26.field3642;
                                            var59[var52] = var26.field3649;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field2825 && arg5 == 0) {
                                    class398.method2371(var12, var14, var26.field3639, var26.field3647 * 8, var26.field3662);
                                }
                                if (var19 != 12 && var26.field3655 != -1 && var26.field3659) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class202.field2652[var19];
                            } else if (var17) {
                                var51 += class302.field3912[var19];
                            } else {
                                var51 += class64.field818[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                class2 var67 = this.field2831.method1639(var22 - 1, 2);
                                class2 var68 = this.field2831.method1639(var23 - 1, 2);
                                class2 var69 = this.field2831.method1639(var24 - 1, 2);
                                class2 var70 = this.field2831.method1639(var25 - 1, 2);
                                for (int var71 = 0; var71 < var49; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class485.field7054[0] = var45[var51];
                                        class485.field7054[1] = 1;
                                        class485.field7054[2] = var46[var51];
                                        class485.field7054[3] = 1;
                                        class485.field7054[4] = var48[var51];
                                        var73 = 6;
                                        class485.field7054[5] = var46[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class485.field7054[0] = var45[var51];
                                        class485.field7054[1] = 5;
                                        class485.field7054[2] = var46[var51];
                                        class485.field7054[3] = 5;
                                        class485.field7054[4] = var48[var51];
                                        class485.field7054[5] = var46[var51];
                                        var73 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class485.field7054[0] = var45[var51];
                                        class485.field7054[1] = 3;
                                        class485.field7054[2] = var46[var51];
                                        class485.field7054[3] = 3;
                                        class485.field7054[4] = var48[var51];
                                        var73 = 6;
                                        class485.field7054[5] = var46[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class485.field7054[0] = var45[var51];
                                        class485.field7054[1] = 7;
                                        class485.field7054[2] = var46[var51];
                                        class485.field7054[3] = 7;
                                        class485.field7054[4] = var48[var51];
                                        var73 = 6;
                                        class485.field7054[5] = var46[var51];
                                    } else {
                                        class485.field7054[0] = var45[var51];
                                        class485.field7054[1] = var48[var51];
                                        var73 = 3;
                                        class485.field7054[2] = var46[var51];
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class485.field7054[var74];
                                        int var76 = var75 - (var20 * 2) & 0x7;
                                        int var77 = this.field2841[var75];
                                        int var78 = this.field2846[var75];
                                        int var79;
                                        int var80;
                                        if (var20 == 1) {
                                            var79 = var78;
                                            var80 = 128 - var77;
                                        } else if (var20 == 2) {
                                            var79 = 128 - var77;
                                            var80 = 128 - var78;
                                        } else if (var20 == 3) {
                                            var80 = var77;
                                            var79 = 128 - var78;
                                        } else {
                                            var79 = var77;
                                            var80 = var78;
                                        }
                                        var55[var52] = var79;
                                        var56[var52] = var80;
                                        if (var60 != null && class25.field441[var19][var75]) {
                                            int var81 = (var12 << 7) + var79;
                                            int var82 = (var14 << 7) + var80;
                                            var60[var52] = arg0.method1185(var81, var82) - arg3.method1185(var81, var82);
                                        }
                                        if (var61 != null) {
                                            if (arg0 != null && !class25.field441[var19][var75]) {
                                                int var83 = (var12 << 7) + var79;
                                                int var84 = (var14 << 7) + var80;
                                                var61[var52] = arg3.method1185(var83, var84) - arg0.method1185(var83, var84);
                                            } else if (arg1 != null && !class463.field6653[var19][var75]) {
                                                int var85 = (var12 << 7) + var79;
                                                int var86 = (var14 << 7) + var80;
                                                var61[var52] = arg1.method1185(var85, var86) - arg3.method1185(var85, var86);
                                            }
                                        }
                                        if (var75 < 8 && class107.field1460[var76] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class13.field233[var76];
                                            }
                                            var59[var52] = class370.field4776[var76];
                                            var58[var52] = class314.field4048[var76];
                                            var57[var52] = class278.field3558[var76];
                                        } else {
                                            if (var17 && class25.field441[var19][var75]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var57[var52] = arg4[var12][var14];
                                                var58[var52] = var67.field7;
                                                var59[var52] = var67.field8;
                                            } else if (var79 == 0 && var80 == 128) {
                                                var57[var52] = arg4[var12][var15];
                                                var58[var52] = var68.field7;
                                                var59[var52] = var68.field8;
                                            } else if (var79 == 128 && var80 == 128) {
                                                var57[var52] = arg4[var13][var15];
                                                var58[var52] = var69.field7;
                                                var59[var52] = var69.field8;
                                            } else if (var79 == 128 && var80 == 0) {
                                                var57[var52] = arg4[var13][var14];
                                                var58[var52] = var70.field7;
                                                var59[var52] = var70.field8;
                                            } else {
                                                if (var79 >= 64) {
                                                    if (var80 < 64) {
                                                        var58[var52] = var70.field7;
                                                        var59[var52] = var70.field8;
                                                    } else {
                                                        var58[var52] = var69.field7;
                                                        var59[var52] = var69.field8;
                                                    }
                                                } else if (var80 >= 64) {
                                                    var58[var52] = var68.field7;
                                                    var59[var52] = var68.field8;
                                                } else {
                                                    var58[var52] = var67.field7;
                                                    var59[var52] = var67.field8;
                                                }
                                                int var87 = class296.method1781(arg4[var13][var14], arg4[var12][var14], (byte) -121, var79 << 7 >> 7);
                                                int var88 = class296.method1781(arg4[var13][var15], arg4[var12][var15], (byte) -121, var79 << 7 >> 7);
                                                var57[var52] = class296.method1781(var88, var87, (byte) -121, var80 << 7 >> 7);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field19) {
                                    var16 = true;
                                }
                            }
                            int var89 = arg3.method1187(var12, var14);
                            int var90 = arg3.method1187(var13, var14);
                            int var91 = arg3.method1187(var13, var15);
                            int var92 = arg3.method1187(var12, var15);
                            if (arg5 > 0) {
                                boolean var93 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var93 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field3653) {
                                    var93 = false;
                                }
                                if (var93 && var89 == var90 && var89 == var91 && var89 == var92) {
                                    this.field2842[arg5][var12][var14] = (byte) class31.method213(this.field2842[arg5][var12][var14], 4);
                                }
                            }
                            int var94 = 0;
                            int var95 = 0;
                            int var96 = 0;
                            if (this.field2825) {
                                var94 = class12.method92(var12, var14);
                                var95 = class124.method785(var12, var14);
                                var96 = class44.method287(var12, var14);
                            }
                            arg3.method1175(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var94, var95, var96, var16);
                            class234.method1482(arg5, var12, var14);
                        }
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 872)
    public static final void method1403(int arg0) {
        if (arg0 != -4498) {
            return;
        }
        try {
            Method var1 = (field2858 == null ? (field2858 = method1417("java.lang.Runtime")) : field2858).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class78.field1003 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field2821++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIZIIILbt;I)V", line = 907)
    private final void method1404(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, class88 arg9, int arg10) {
        if (arg2 == 1) {
            arg0 = 1;
        } else if (arg2 == 2) {
            arg0 = 1;
            arg6 = 1;
        } else if (arg2 == 3) {
            arg6 = 1;
        }
        field2848++;
        if (arg7 >= 0 && this.field2829 > arg7 && arg3 >= 0 && this.field2819 > arg3) {
            if (!this.field2825 && !arg5) {
                class8.field76[arg10][arg7][arg3] = 0;
            }
            while (true) {
                int var12 = arg9.method617(2);
                if (var12 == 0) {
                    if (this.field2825) {
                        this.field2824[0][arg7 + arg6][arg3 + arg0] = 0;
                    } else if (arg10 == 0) {
                        this.field2824[0][arg6 + arg7][arg3 + arg0] = -class56.method322(arg1 + 932731, 60, arg4 + 556238) * 8 << 0;
                    } else {
                        this.field2824[arg10][arg6 + arg7][arg0 + arg3] = this.field2824[arg10 - 1][arg6 + arg7][arg0 + arg3] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg9.method617(2);
                    if (this.field2825) {
                        this.field2824[0][arg6 + arg7][arg0 + arg3] = var13 * 8 << 0;
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg10 == 0) {
                            this.field2824[0][arg6 + arg7][arg0 + arg3] = -var13 * 8 << 0;
                        } else {
                            this.field2824[arg10][arg6 + arg7][arg0 + arg3] = this.field2824[arg10 - 1][arg7 + arg6][arg0 + arg3] - (var13 * 8 << 0);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg5) {
                        arg9.method617(2);
                    } else {
                        this.field2837[arg10][arg7][arg3] = arg9.method575(-17);
                        this.field2847[arg10][arg7][arg3] = (byte) ((var12 - 2) / 4);
                        this.field2823[arg10][arg7][arg3] = (byte) class60.method339(3, var12 + arg2 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!this.field2825 && !arg5) {
                        class8.field76[arg10][arg7][arg3] = (byte) (var12 - 49);
                    }
                } else if (!arg5) {
                    this.field2839[arg10][arg7][arg3] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg9.method617(2);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg9.method617(2);
                    break;
                }
                if (var14 <= 49) {
                    arg9.method617(2);
                }
            }
        }
        if (arg8 >= -12) {
            this.field2823 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIILbt;IIII[Lbm;I)V", line = 1032)
    public final void method1405(int arg0, int arg1, int arg2, class88 arg3, int arg4, int arg5, int arg6, int arg7, class215[] arg8, int arg9) {
        field2850++;
        int var11 = (arg2 & 0x7) * 8;
        int var12 = (arg6 & 0x7) * 8;
        if (!this.field2825) {
            class215 var13 = arg8[arg9];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = class193.method1251(var14 & 0x7, arg4, var15 & 0x7, (byte) -105) + arg1;
                    int var17 = class182.method1197(arg4, var14 & 0x7, var15 & 0x7, (byte) 78) + arg0;
                    if (var16 > 0 && var16 < (this.field2829 - 1) && var17 > 0 && var17 < this.field2819 - 1) {
                        var13.method1375(var16, 116, var17);
                    }
                }
            }
        }
        int var18 = arg2 & 0x1FFFFFF8 << 3;
        int var19 = arg6 & 0x1FFFFFF8 << 3;
        if (arg5 != -5978) {
            return;
        }
        byte var20 = 0;
        byte var21 = 0;
        if (arg4 == 1) {
            var21 = 1;
        } else if (arg4 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg4 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field2838; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg7 != var22 || var11 > var23 || var11 + 8 < var23 || var12 > var24 || var24 > var12 + 8) {
                        this.method1404(0, 0, 0, -1, 0, false, 0, -1, -82, arg3, 0);
                    } else if (var11 + 8 == var23 || var12 + 8 == var24) {
                        int var31;
                        int var32;
                        if (arg4 == 0) {
                            var31 = var24 + arg0 - var12;
                            var32 = -var11 - (-var23 - arg1);
                        } else if (arg4 == 1) {
                            var31 = var11 + arg0 + 8 - var23;
                            var32 = var24 + arg1 - var12;
                        } else if (arg4 == 2) {
                            var31 = var12 + arg0 + 8 - var24;
                            var32 = var11 + arg1 + 8 - var23;
                        } else {
                            var31 = var23 + arg0 - var11;
                            var32 = arg1 + 8 - (-var12 + var24);
                        }
                        this.method1404(0, var18 + var23, 0, var31, var19 + var24, true, 0, var32, -28, arg3, arg9);
                    } else {
                        int var25 = class193.method1251(var23 & 0x7, arg4, var24 & 0x7, (byte) -63) + arg1;
                        int var26 = class182.method1197(arg4, var23 & 0x7, var24 & 0x7, (byte) 78) + arg0;
                        this.method1404(var21, var18 + var23, arg4, var26, var19 + var24, false, var20, var25, arg5 + 5886, arg3, arg9);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg4 == 0) {
                                var29 = -var12 - (-var28 - arg0);
                                var30 = var27 - (var11 - arg1);
                            } else if (arg4 == 1) {
                                var29 = var11 + arg0 + 8 - var27;
                                var30 = var28 - (var12 - arg1);
                            } else if (arg4 == 2) {
                                var30 = arg1 + var11 + 8 - var27;
                                var29 = var12 + 8 - (var28 - arg0);
                            } else {
                                var29 = var27 + arg0 - var11;
                                var30 = arg1 + var12 + 8 - var28;
                            }
                            if (var30 >= 0 && var30 < this.field2829 && var29 >= 0 && var29 < this.field2819) {
                                this.field2824[arg9][var30][var29] = this.field2824[arg9][var20 + var25][var21 + var26];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 1210)
    public static final void method1406(String arg0, int arg1) {
        field2830++;
        if (arg1 <= -85 && class238.field3092 != null) {
            class420.method2472((byte) -101, class117.field1636);
            class95.field1326++;
            class319.field4112.method565(72, class415.method2442(88, arg0));
            class319.field4112.method597(-128, arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([[III)V", line = 1228)
    public final void method1407(int[][] arg0, int arg1, int arg2) {
        field2836++;
        int[][] var4 = this.field2824[arg2];
        int var5 = 0;
        if (arg1 != -1) {
            this.method1416(null, null, null, -14);
        }
        while (this.field2829 + 1 > var5) {
            for (int var6 = 0; var6 < (this.field2819 + 1); var6++) {
                var4[var5][var6] += arg0[var5][var6];
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V", line = 1264)
    public final void method1408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2843++;
        for (int var6 = 0; var6 < this.field2838; var6++) {
            this.method1414(arg3, arg4, arg0 ^ 0xFFFFC0FD, arg2, var6, arg1);
        }
        if (arg0 != -16132) {
            field2845 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 1281)
    public static void method1409(int arg0) {
        field2826 = null;
        field2856 = null;
        if (arg0 == -2798) {
            field2855 = null;
            field2845 = null;
            field2832 = null;
            field2851 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lbt;IIZI[Lbm;I)V", line = 1298)
    public final void method1410(class88 arg0, int arg1, int arg2, boolean arg3, int arg4, class215[] arg5, int arg6) {
        if (!this.field2825) {
            for (int var8 = 0; var8 < 4; var8++) {
                class215 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg6 + var11;
                        if (var12 >= 0 && this.field2829 > var12 && var13 >= 0 && var13 < this.field2819) {
                            var9.method1375(var12, 110, var13);
                        }
                    }
                }
            }
        }
        field2820++;
        int var14 = arg2 + arg4;
        int var15 = arg1 + arg6;
        for (int var16 = 0; var16 < this.field2838; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1404(0, var14 + var17, 0, var18 + arg6, var15 + var18, false, 0, arg4 + var17, -107, arg0, var16);
                }
            }
        }
        if (arg3) {
            field2855 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lna;Lna;ILqa;)V", line = 1377)
    public final void method1411(class251 arg0, class251 arg1, int arg2, class129 arg3) {
        if (arg2 != 30142) {
            return;
        }
        field2828++;
        if (class512.field7534 == null || class512.field7534.length != this.field2819) {
            class446.field6207 = new int[this.field2819];
            class512.field7534 = new int[this.field2819];
            class385.field5065 = new int[this.field2819];
            class138.field1849 = new int[this.field2819];
            class333.field4260 = new int[this.field2819];
        }
        int[][] var5 = new int[this.field2829][this.field2819];
        for (int var6 = 0; var6 < this.field2838; var6++) {
            for (int var8 = 0; var8 < this.field2819; var8++) {
                class512.field7534[var8] = 0;
                class385.field5065[var8] = 0;
                class333.field4260[var8] = 0;
                class446.field6207[var8] = 0;
                class138.field1849[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field2829; var9++) {
                for (int var10 = 0; var10 < this.field2819; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field2829) {
                        int var20 = this.field2839[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class2 var21 = this.field2831.method1639(var20 - 1, 2);
                            class512.field7534[var10] += var21.field10;
                            class385.field5065[var10] += var21.field17;
                            class333.field4260[var10] += var21.field18;
                            class446.field6207[var10] += var21.field14;
                            var10002 = class138.field1849[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field2839[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class2 var24 = this.field2831.method1639(var23 - 1, 2);
                            class512.field7534[var10] -= var24.field10;
                            class385.field5065[var10] -= var24.field17;
                            class333.field4260[var10] -= var24.field18;
                            class446.field6207[var10] -= var24.field14;
                            var10002 = class138.field1849[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field2819; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field2819) {
                            var15 += class138.field1849[var17];
                            var11 += class512.field7534[var17];
                            var14 += class446.field6207[var17];
                            var13 += class333.field4260[var17];
                            var12 += class385.field5065[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class333.field4260[var18];
                            var15 -= class138.field1849[var18];
                            var11 -= class512.field7534[var18];
                            var12 -= class385.field5065[var18];
                            var14 -= class446.field6207[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class133.method934(var11 * 256 / var14, true, var13 / var15, var12 / var15);
                        }
                    }
                }
            }
            if (class349.field4470) {
                this.method1402(var6 == 0 ? arg1 : null, var6 == 0 ? arg0 : null, arg3, class92.field1285[var6], var5, var6, 2);
            } else {
                this.method1413(var5, var6, var6 == 0 ? arg0 : null, (byte) 125, var6 == 0 ? arg1 : null, arg3, class92.field1285[var6]);
            }
            this.field2839[var6] = null;
            this.field2837[var6] = null;
            this.field2847[var6] = null;
            this.field2823[var6] = null;
        }
        if (!this.field2825) {
            if (class527.field7785 != 0) {
                class159.method1068();
            }
            if (class367.field4718) {
                class299.method1797();
            }
        }
        for (int var7 = 0; var7 < this.field2838; var7++) {
            class92.field1285[var7].method1183();
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lmv;Z)V", line = 1555)
    public static final void method1412(class518 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field2840++;
        class72 var2 = (class72) class157.field2072.method2085((long) arg0.field5159, -5423);
        if (var2 == null) {
            class25.method167(null, null, arg0, arg0.field5246[0], 0, 255, arg0.field6220, arg0.field5251[0]);
        } else {
            var2.method409(101);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([[IILna;BLna;Lqa;Lna;)V", line = 1578)
    private final void method1413(int[][] arg0, int arg1, class251 arg2, byte arg3, class251 arg4, class129 arg5, class251 arg6) {
        if (arg3 < 123) {
            field2854 = 108;
        }
        for (int var8 = 0; var8 < this.field2829; var8++) {
            for (int var9 = 0; var9 < this.field2819; var9++) {
                if (class306.field3945 == -1 || class303.method1818(var9, class306.field3945, -19236, var8, arg1)) {
                    byte var10 = this.field2847[arg1][var8][var9];
                    byte var11 = this.field2823[arg1][var8][var9];
                    int var12 = this.field2837[arg1][var8][var9] & 0xFF;
                    int var13 = this.field2839[arg1][var8][var9] & 0xFF;
                    class286 var14 = var12 == 0 ? null : this.field2833.method20(123, var12 - 1);
                    class2 var15 = var13 == 0 ? null : this.field2831.method1639(var13 - 1, 2);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var16 = var15 == null ? 0 : class378.field4903[var10];
                        var17 = var14 == null ? 0 : class202.field2652[var10];
                    } else if (var14 != null) {
                        var17 = class202.field2652[var10];
                    } else if (var15 != null) {
                        var16 = class202.field2652[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field3655 == -1 && var14.field3648 == -1 && var14.field3638 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg5.method890() ? var14.field3638 : var14.field3642;
                            if (class428.field5867) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field3649;
                                if (var14.field3655 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field3655;
                                }
                                if (var14.field3648 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field3648;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field2825 && arg1 == 0) {
                                class398.method2371(var8, var9, var14.field3639, var14.field3647 * 8, var14.field3662);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field7;
                            if (class428.field5867) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field8;
                                var20[var19] = arg0[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field2841.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg4 == null ? null : new int[var31];
                        int[] var35 = arg4 == null && arg2 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field2841[var36];
                            int var46 = this.field2846[var36];
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
                            if (var34 != null && class25.field441[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg4.method1185(var49, var50) - arg6.method1185(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg4 != null && !class25.field441[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg6.method1185(var51, var52) - arg4.method1185(var51, var52);
                                } else if (arg2 != null && !class463.field6653[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg2.method1185(var53, var54) - arg6.method1185(var53, var54);
                                }
                            }
                        }
                        int var37 = arg6.method1187(var8, var9);
                        int var38 = arg6.method1187(var8 + 1, var9);
                        int var39 = arg6.method1187(var8 + 1, var9 + 1);
                        int var40 = arg6.method1187(var8, var9 + 1);
                        if (arg1 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field3653) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field2842[arg1][var8][var9] = (byte) class31.method213(this.field2842[arg1][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field2825) {
                            var42 = class12.method92(var8, var9);
                            var43 = class124.method785(var8, var9);
                            var44 = class44.method287(var8, var9);
                        }
                        arg6.method1176(var8, var9, var32, var34, var33, var35, class269.field3404[var10], class326.field4182[var10], class275.field3509[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class234.method1482(arg1, var8, var9);
                    }
                }
            }
        }
        field2834++;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIZLer;Lvn;)V", line = 2471)
    public class221(int arg0, int arg1, int arg2, boolean arg3, class4 arg4, class261 arg5) {
        this.field2833 = arg4;
        this.field2825 = arg3;
        this.field2831 = arg5;
        this.field2829 = arg1;
        this.field2838 = arg0;
        this.field2819 = arg2;
        this.field2847 = new byte[this.field2838][this.field2829][this.field2819];
        this.field2839 = new byte[this.field2838][this.field2829][this.field2819];
        this.field2842 = new byte[this.field2838][this.field2829 + 1][this.field2819 + 1];
        this.field2823 = new byte[this.field2838][this.field2829][this.field2819];
        this.field2824 = new int[this.field2838][this.field2829 + 1][this.field2819 + 1];
        this.field2837 = new byte[this.field2838][this.field2829][this.field2819];
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)V", line = 1901)
    public final void method1414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg0;
        if (arg2 != 1) {
            return;
        }
        while (var7 < (arg0 + arg3)) {
            for (int var10 = arg5; var10 < (arg1 + arg5); var10++) {
                if (var10 >= 0 && this.field2829 > var10 && var7 >= 0 && this.field2819 > var7) {
                    this.field2824[arg4][var10][var7] = arg4 <= 0 ? 0 : this.field2824[arg4 - 1][var10][var7] - 240;
                }
            }
            var7++;
        }
        field2844++;
        if (arg5 > 0 && arg5 < this.field2829) {
            for (int var8 = arg0 + 1; var8 < (arg0 + arg3); var8++) {
                if (var8 >= 0 && var8 < this.field2819) {
                    this.field2824[arg4][arg5][var8] = this.field2824[arg4][arg5 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && arg0 < this.field2819) {
            for (int var9 = arg5 + 1; var9 < arg5 + arg1; var9++) {
                if (var9 >= 0 && this.field2829 > var9) {
                    this.field2824[arg4][var9][arg0] = this.field2824[arg4][var9][arg0 - 1];
                }
            }
        }
        if (arg5 < 0 || arg0 < 0 || this.field2829 <= arg5 || arg0 >= this.field2819) {
            return;
        }
        if (arg4 != 0) {
            if (arg5 > 0 && this.field2824[arg4 - 1][arg5 - 1][arg0] != this.field2824[arg4][arg5 - 1][arg0]) {
                this.field2824[arg4][arg5][arg0] = this.field2824[arg4][arg5 - 1][arg0];
                return;
            }
            if (arg0 > 0 && this.field2824[arg4][arg5][arg0 - 1] != this.field2824[arg4 - 1][arg5][arg0 - 1]) {
                this.field2824[arg4][arg5][arg0] = this.field2824[arg4][arg5][arg0 - 1];
                return;
            }
            if (arg5 > 0 && arg0 > 0 && this.field2824[arg4][arg5 - 1][arg0 - 1] != this.field2824[arg4 - 1][arg5 - 1][arg0 - 1]) {
                this.field2824[arg4][arg5][arg0] = this.field2824[arg4][arg5 - 1][arg0 - 1];
                return;
            }
            return;
        }
        if (arg5 > 0 && this.field2824[arg4][arg5 - 1][arg0] != 0) {
            this.field2824[arg4][arg5][arg0] = this.field2824[arg4][arg5 - 1][arg0];
            return;
        }
        if (arg0 > 0 && this.field2824[arg4][arg5][arg0 - 1] != 0) {
            this.field2824[arg4][arg5][arg0] = this.field2824[arg4][arg5][arg0 - 1];
            return;
        }
        if (arg5 > 0 && arg0 > 0 && this.field2824[arg4][arg5 - 1][arg0 - 1] != 0) {
            this.field2824[arg4][arg5][arg0] = this.field2824[arg4][arg5 - 1][arg0 - 1];
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lqa;[[BLfs;III[ZBLuv;[[BII[[BI)V", line = 1995)
    private final void method1415(class129 arg0, byte[][] arg1, class286 arg2, int arg3, int arg4, int arg5, boolean[] arg6, byte arg7, class2 arg8, byte[][] arg9, int arg10, int arg11, byte[][] arg12, int arg13) {
        if (arg2 != null && arg8 != null || arg8 != null && arg10 == 12 || arg2 != null && arg10 == 0) {
            boolean[] var15 = arg2 != null && arg2.field3651 ? class264.field3356[arg10] : class71.field882[arg10];
            if (arg3 > 0) {
                if (arg4 > 0) {
                    int var16 = arg1[arg4 - 1][arg3 - 1] & 0xFF;
                    if (var16 > 0) {
                        class286 var17 = this.field2833.method20(arg7 + 65, var16 + -1);
                        if (var17.field3655 != -1 && var17.field3651) {
                            byte var18 = arg9[arg4 - 1][arg3 - 1];
                            int var19 = arg12[arg4 - 1][arg3 - 1] * 2 + 4 & 0x7;
                            int var20 = class466.method2812(var17, false, arg0);
                            if (class25.field441[var18][var19]) {
                                class278.field3558[0] = var17.field3655;
                                class13.field233[0] = var20;
                                class314.field4048[0] = arg0.method890() ? var17.field3638 : var17.field3642;
                                class370.field4776[0] = var17.field3649;
                                class107.field1460[0] = var17.field3641;
                                class274.field3484[0] = 256;
                            }
                        }
                    }
                }
                if (arg11 - 1 > arg4) {
                    int var21 = arg1[arg4 + 1][arg3 - 1] & 0xFF;
                    if (var21 > 0) {
                        class286 var22 = this.field2833.method20(arg7 ^ 0x41, var21 - 1);
                        if (var22.field3655 != -1 && var22.field3651) {
                            byte var23 = arg9[arg4 + 1][arg3 - 1];
                            int var24 = arg12[arg4 + 1][arg3 - 1] * 2 + 6 & 0x7;
                            int var25 = class466.method2812(var22, false, arg0);
                            if (class25.field441[var23][var24]) {
                                class278.field3558[2] = var22.field3655;
                                class13.field233[2] = var25;
                                class314.field4048[2] = arg0.method890() ? var22.field3638 : var22.field3642;
                                class370.field4776[2] = var22.field3649;
                                class107.field1460[2] = var22.field3641;
                                class274.field3484[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg13 - 1 > arg3) {
                if (arg4 > 0) {
                    int var26 = arg1[arg4 - 1][arg3 + 1] & 0xFF;
                    if (var26 > 0) {
                        class286 var27 = this.field2833.method20(arg7 + 66, var26 + -1);
                        if (var27.field3655 != -1 && var27.field3651) {
                            byte var28 = arg9[arg4 - 1][arg3 + 1];
                            int var29 = arg12[arg4 - 1][arg3 + 1] * 2 + 2 & 0x7;
                            int var30 = class466.method2812(var27, false, arg0);
                            if (class25.field441[var28][var29]) {
                                class278.field3558[6] = var27.field3655;
                                class13.field233[6] = var30;
                                class314.field4048[6] = arg0.method890() ? var27.field3638 : var27.field3642;
                                class370.field4776[6] = var27.field3649;
                                class107.field1460[6] = var27.field3641;
                                class274.field3484[6] = 64;
                            }
                        }
                    }
                }
                if (arg4 < (arg11 - 1)) {
                    int var31 = arg1[arg4 + 1][arg3 + 1] & 0xFF;
                    if (var31 > 0) {
                        class286 var32 = this.field2833.method20(arg7 + 63, var31 - 1);
                        if (var32.field3655 != -1 && var32.field3651) {
                            byte var33 = arg9[arg4 + 1][arg3 + 1];
                            int var34 = arg12[arg4 + 1][arg3 + 1] * 2 & 0x7;
                            int var35 = class466.method2812(var32, false, arg0);
                            if (class25.field441[var33][var34]) {
                                class278.field3558[4] = var32.field3655;
                                class13.field233[4] = var35;
                                class314.field4048[4] = arg0.method890() ? var32.field3638 : var32.field3642;
                                class370.field4776[4] = var32.field3649;
                                class107.field1460[4] = var32.field3641;
                                class274.field3484[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg3 > 0) {
                int var36 = arg1[arg4][arg3 - 1] & 0xFF;
                if (var36 > 0) {
                    class286 var37 = this.field2833.method20(arg7 + 63, var36 + -1);
                    if (var37.field3655 != -1) {
                        byte var38 = arg9[arg4][arg3 - 1];
                        byte var39 = arg12[arg4][arg3 - 1];
                        if (var37.field3651) {
                            int var40 = 2;
                            int var41 = (var39 * 2) + 4;
                            int var42 = class466.method2812(var37, false, arg0);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var41 &= 0x7;
                                var40 &= 0x7;
                                if (class25.field441[var38][var41] && class107.field1460[var40] <= var37.field3641) {
                                    class278.field3558[var40] = var37.field3655;
                                    class13.field233[var40] = var42;
                                    class314.field4048[var40] = arg0.method890() ? var37.field3638 : var37.field3642;
                                    class370.field4776[var40] = var37.field3649;
                                    if (class107.field1460[var40] == var37.field3641) {
                                        class274.field3484[var40] = class31.method213(class274.field3484[var40], 32);
                                    } else {
                                        class274.field3484[var40] = 32;
                                    }
                                    class107.field1460[var40] = var37.field3641;
                                }
                                var40--;
                                var41++;
                            }
                            if (!var15[arg5 & 0x3]) {
                                arg6[0] = class264.field3356[var38][class60.method339(var39 + 2, 3)];
                            }
                        } else if (!var15[arg5 & 0x3]) {
                            arg6[0] = class71.field882[var38][class60.method339(3, var39 + 2)];
                        }
                    }
                }
            }
            if (arg3 < arg13 - 1) {
                int var44 = arg1[arg4][arg3 + 1] & 0xFF;
                if (var44 > 0) {
                    class286 var45 = this.field2833.method20(125, var44 - 1);
                    if (var45.field3655 != -1) {
                        byte var46 = arg9[arg4][arg3 + 1];
                        byte var47 = arg12[arg4][arg3 + 1];
                        if (var45.field3651) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class466.method2812(var45, false, arg0);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var49 &= 0x7;
                                var48 &= 0x7;
                                if (class25.field441[var46][var49] && class107.field1460[var48] <= var45.field3641) {
                                    class278.field3558[var48] = var45.field3655;
                                    class13.field233[var48] = var50;
                                    class314.field4048[var48] = arg0.method890() ? var45.field3638 : var45.field3642;
                                    class370.field4776[var48] = var45.field3649;
                                    if (class107.field1460[var48] == var45.field3641) {
                                        class274.field3484[var48] = class31.method213(class274.field3484[var48], 16);
                                    } else {
                                        class274.field3484[var48] = 16;
                                    }
                                    class107.field1460[var48] = var45.field3641;
                                }
                                var48++;
                                var49--;
                            }
                            if (!var15[arg5 + 2 & 0x3]) {
                                arg6[2] = class264.field3356[var46][class60.method339(3, var47)];
                            }
                        } else if (!var15[arg5 + 2 & 0x3]) {
                            arg6[2] = class71.field882[var46][class60.method339(3, var47)];
                        }
                    }
                }
            }
            if (arg4 > 0) {
                int var52 = arg1[arg4 - 1][arg3] & 0xFF;
                if (var52 > 0) {
                    class286 var53 = this.field2833.method20(125, var52 - 1);
                    if (var53.field3655 != -1) {
                        byte var54 = arg9[arg4 - 1][arg3];
                        byte var55 = arg12[arg4 - 1][arg3];
                        if (var53.field3651) {
                            int var56 = 6;
                            int var57 = var55 * 2 + 4;
                            int var58 = class466.method2812(var53, false, arg0);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var56 &= 0x7;
                                var57 &= 0x7;
                                if (class25.field441[var54][var57] && class107.field1460[var56] <= var53.field3641) {
                                    class278.field3558[var56] = var53.field3655;
                                    class13.field233[var56] = var58;
                                    class314.field4048[var56] = arg0.method890() ? var53.field3638 : var53.field3642;
                                    class370.field4776[var56] = var53.field3649;
                                    if (class107.field1460[var56] == var53.field3641) {
                                        class274.field3484[var56] = class31.method213(class274.field3484[var56], 8);
                                    } else {
                                        class274.field3484[var56] = 8;
                                    }
                                    class107.field1460[var56] = var53.field3641;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg5 + 3 & 0x3]) {
                                arg6[3] = class264.field3356[var54][class60.method339(var55 + 1, 3)];
                            }
                        } else if (!var15[arg5 + 3 & 0x3]) {
                            arg6[3] = class71.field882[var54][class60.method339(var55 + 1, 3)];
                        }
                    }
                }
            }
            if (arg11 - 1 > arg4) {
                int var60 = arg1[arg4 + 1][arg3] & 0xFF;
                if (var60 > 0) {
                    class286 var61 = this.field2833.method20(125, var60 - 1);
                    if (var61.field3655 != -1) {
                        byte var62 = arg9[arg4 + 1][arg3];
                        byte var63 = arg12[arg4 + 1][arg3];
                        if (var61.field3651) {
                            int var64 = 4;
                            int var65 = (var63 * 2) + 6;
                            int var66 = class466.method2812(var61, false, arg0);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var65 &= 0x7;
                                var64 &= 0x7;
                                if (class25.field441[var62][var65] && class107.field1460[var64] <= var61.field3641) {
                                    class278.field3558[var64] = var61.field3655;
                                    class13.field233[var64] = var66;
                                    class314.field4048[var64] = arg0.method890() ? var61.field3638 : var61.field3642;
                                    class370.field4776[var64] = var61.field3649;
                                    if (class107.field1460[var64] == var61.field3641) {
                                        class274.field3484[var64] = class31.method213(class274.field3484[var64], 4);
                                    } else {
                                        class274.field3484[var64] = 4;
                                    }
                                    class107.field1460[var64] = var61.field3641;
                                }
                                var64--;
                                var65++;
                            }
                            if (!var15[arg5 + 1 & 0x3]) {
                                arg6[1] = class264.field3356[var62][class60.method339(var63 + 3, 3)];
                            }
                        } else if (!var15[arg5 + 1 & 0x3]) {
                            arg6[1] = class71.field882[var62][class60.method339(var63 + 3, 3)];
                        }
                    }
                }
            }
        }
        field2849++;
        if (arg2 != null) {
            int var68 = class466.method2812(arg2, false, arg0);
            if (arg2.field3651) {
                for (int var69 = 0; var69 < 8; var69++) {
                    int var70 = var69 - (arg5 * 2) & 0x7;
                    if (class25.field441[arg10][var69] && arg2.field3641 >= class107.field1460[var70]) {
                        class278.field3558[var70] = arg2.field3655;
                        class13.field233[var70] = var68;
                        class314.field4048[var70] = arg0.method890() ? arg2.field3638 : arg2.field3642;
                        class370.field4776[var70] = arg2.field3649;
                        if (class107.field1460[var70] == arg2.field3641) {
                            class274.field3484[var70] = class31.method213(class274.field3484[var70], 2);
                        } else {
                            class274.field3484[var70] = 2;
                        }
                        class107.field1460[var70] = arg2.field3641;
                    }
                }
            }
        }
        if (arg7 != 60) {
            this.method1408(107, -48, 82, -79, 70);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([Lbm;[[[ILqa;I)V", line = 2494)
    public final void method1416(class215[] arg0, int[][][] arg1, class129 arg2, int arg3) {
        if (arg3 >= -126) {
            this.method1414(-3, -49, 110, -107, 2, -63);
        }
        field2827++;
        if (!this.field2825) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field2829; var6++) {
                    for (int var7 = 0; var7 < this.field2819; var7++) {
                        if ((class8.field76[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class8.field76[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg0[var8].method1381(var6, 91, var7);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field2838; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field2825) {
                if (class367.field4718) {
                    var10 |= 0x2;
                }
                if (class72.field899) {
                    var11 |= 0x8;
                }
                if (class527.field7785 != 0) {
                    if (var9 == 0 | class282.field3600) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class367.field4718) {
                var11 |= 0x7;
            }
            if (!class291.field3727) {
                var11 |= 0x20;
            }
            int[][] var12 = arg1 == null || arg1.length <= var9 ? this.field2824[var9] : arg1[var9];
            class126.method803(var9, arg2.method909(this.field2829, this.field2819, this.field2824[var9], var12, 128, var10, var11));
        }
    }
}
